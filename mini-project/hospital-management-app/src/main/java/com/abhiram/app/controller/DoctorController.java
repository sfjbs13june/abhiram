package com.abhiram.app.controller;

import com.abhiram.app.model.Appointment;
import com.abhiram.app.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/doctor")
public class DoctorController {
    @Autowired
    AppointmentRepository appointmentRepository;
    @GetMapping("/doctor-appointment")
    public Appointment getAppointments(@RequestParam String doctorName){
        return appointmentRepository.findByName(doctorName);
    }
    @PostMapping("/save")
    public Appointment saveAppointment(@RequestBody Appointment appointment){
        appointment=appointmentRepository.save(appointment);
        return appointment;
    }
}
