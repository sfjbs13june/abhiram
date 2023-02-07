package com.abhiram.app.controller;

import com.abhiram.app.model.Appointment;
import com.abhiram.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PatientController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @RequestMapping(value = "/myappointment",method = RequestMethod.GET)
    public Appointment getMyAppointments(@RequestParam String patientName){
        return appointmentRepository.findByPatientName(patientName);
    }
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment=appointmentRepository.save(appointment);
        return appointment;
    }
}
