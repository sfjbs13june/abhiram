package com.mongo.app.controller;

import com.mongo.app.repository.PatientRepository;
import com.mongo.app.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/patient")
public class PatientController {

    @Autowired
    PatientRepository patientRepository;

    @RequestMapping(value = "/read", method = RequestMethod.GET)
    public Iterable<Patient> readPatient() {
        return patientRepository.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public Patient create(@RequestBody Patient patient) {
        patient = patientRepository.save(patient);
        return patient;
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public void deleteByNam(@RequestParam String name) {
        patientRepository.deleteByName(name);
    }

    @RequestMapping(value = "/findById", method = RequestMethod.GET)
    public void findByID(@RequestParam String patId) {
        patientRepository.findByPatId(patId);
    }
}