package com.abhiram.app.controller;

import com.abhiram.app.model.Appointment;
import com.abhiram.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/patient")
public class PatientController {
    @GetMapping("/myappointment")
    public Map getMyAppointment(@RequestParam String patientName){
        Map ptoaMap=new HashMap();
        Prescription p1=(Prescription) PrescriptionController.getAllPrescriptions("xyz");
        Appointment appointment1=new Appointment("123","xyz","abc","25-01-2023",p1);

        ptoaMap.put(appointment1.getPatientName(),appointment1);
        return ptoaMap;
    }

    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        Prescription p1=new Prescription("789","123","fever","xyz","abc");
        Appointment appointment1=new Appointment("123","xyz","abc","25-01-2023",p1);

        //saveAppointment(appointment1);
        System.out.println(appointment);
        return appointment;
    }
}
