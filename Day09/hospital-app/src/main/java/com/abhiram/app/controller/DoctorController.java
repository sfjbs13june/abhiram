package com.abhiram.app.controller;

import com.abhiram.app.model.Appointment;
import com.abhiram.app.model.Prescription;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;


@RequestMapping("/doctor")
public class DoctorController {
    @GetMapping("/doctor-appointment")
    public Map getAppointments(@RequestParam String doctorName){
        Map dtopMap=new HashMap();
       // Prescription p1= (Prescription) PrescriptionController.getAllPrescriptions("xyz");
        Prescription p1=new Prescription("789","123","fever","xyz","abc");
        Appointment appointment1=new Appointment("123","xyz","abc","25-01-2023",p1);

        dtopMap.put(appointment1.getDoctorName(),appointment1);
        return dtopMap;

    }

    @PostMapping("/save-appointment")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        Prescription p1=new Prescription("789","123","fever","xyz","abc");
        Appointment appointment1=new Appointment("123","xyz","abc","25-01-2023",p1);

        //saveAppointment(appointment1);
        System.out.println(appointment);
        return appointment;
    }
}
