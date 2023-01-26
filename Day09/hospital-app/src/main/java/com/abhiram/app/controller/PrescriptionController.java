package com.abhiram.app.controller;

import com.abhiram.app.model.Prescription;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/prescription")
public class PrescriptionController {
    @GetMapping("/view-prescription")
    public static Map getAllPrescriptions(String patientName){
        Map ptopMap=new HashMap();
        Prescription prescription1=new Prescription("789","123","fever","xyz","abc");

        ptopMap.put(prescription1.getPatientName(),prescription1);
        return ptopMap;
    }

    @PostMapping("/save-prescription")
    public Prescription savePrescription(@RequestBody Prescription prescription){
        Prescription p1=new Prescription("789","123","fever","xyz","abc");

        //savePrescription(p1);
        System.out.println(prescription);
        return prescription;
    }
}
