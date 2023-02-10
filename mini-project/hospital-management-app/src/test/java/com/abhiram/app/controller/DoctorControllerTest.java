package com.abhiram.app.controller;


import com.abhiram.app.model.Appointment;
import com.abhiram.app.model.Prescription;
import com.abhiram.app.repository.AppointmentRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class DoctorControllerTest {
    @InjectMocks
    private DoctorController doctorController;
    @Mock
    Appointment appointment;
    @Mock
    AppointmentRepository appointmentRepository;
    @BeforeEach
    void setUp(){
        appointment= Mockito.mock(Appointment.class);
        appointmentRepository=Mockito.mock(AppointmentRepository.class);
    }

    @Test
    public void Test1(){
        List test=new ArrayList();
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(test);
        List result=doctorController.getAppointments("abc");
        assertEquals(test,result);
    }

    @Test
    public void Test2(){
        Appointment ap1=new Appointment();
        when(appointmentRepository.save(any(Appointment.class))).thenReturn(ap1);
        Appointment result=doctorController.saveAppointment(appointment);
        assertEquals(ap1,result);
    }

    @Test
    public void Test3(){
        List<Appointment> appointments=new ArrayList();
        Appointment appointment1=new Appointment();
        appointment1.setAppointmentId("123");
        appointment1.setDoctorName("abc");
        appointment1.setDate("10-02-2023");
        appointment1.setPatientName("xyz");
        Prescription prescription=new Prescription("67","123","cough","abc","xyz");
        appointment1.setPrescription(prescription);
        appointments.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("abc");
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
        assertEquals(appointments.get(0).getPrescription(),result.get(0).getPrescription());
    }

    @Test
    public void Test4(){
        List<Appointment> appointments=new ArrayList();
        Prescription prescription1=new Prescription("45","124","fever","ram","ravi");
        Appointment appointment1=new Appointment("124","ravi","ram","10-02-2023",prescription1);
        appointments.add(appointment1);
        when(appointmentRepository.findByDoctorName(anyString())).thenReturn(appointments);
        List<Appointment> result=doctorController.getAppointments("ram");
        assertEquals(appointments.get(0).getAppointmentId(),result.get(0).getAppointmentId());
        assertEquals(appointments.get(0).getDate(),result.get(0).getDate());
        assertEquals(appointments.get(0).getDoctorName(),result.get(0).getDoctorName());
        assertEquals(appointments.get(0).getPatientName(),result.get(0).getPatientName());
    }
    //test

}
