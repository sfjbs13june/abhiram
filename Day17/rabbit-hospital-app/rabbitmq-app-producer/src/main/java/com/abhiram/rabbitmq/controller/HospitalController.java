package com.abhiram.rabbitmq.controller;

import com.abhiram.rabbitmq.model.Hospital;
import com.abhiram.rabbitmq.model.Patient;
import com.abhiram.rabbitmq.service.RabbitMQSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rabbitmq/")
public class HospitalController {
  @Autowired
  RabbitMQSender rabbitMQSender;


  @PostMapping(value = "/hospital")
  public Hospital postHospital(@RequestBody Hospital hospital) {
    rabbitMQSender.sendHospital(hospital);
    System.out.println("Message sent to the RabbitMQ Successfully");
    return hospital;
  }

  @PostMapping(value = "/patient")
  public Patient postPatient(@RequestBody Patient patient) {

    rabbitMQSender.sendPatient(patient);
    System.out.println("Message sent to the RabbitMQ Successfully");
    return patient;
  }
}