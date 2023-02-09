package com.abhiram.app.model;

import java.util.ArrayList;
import java.util.List;

public class Prescription {
    String prescriptionId;
    String appointmentId;
    String description;
    String doctorName;
    String patientName;
    public Prescription(){

    }

    public Prescription(String prescriptionId, String appointmentId, String description, String doctorName, String patientName) {
        this.prescriptionId = prescriptionId;
        this.appointmentId = appointmentId;
        this.description = description;
        this.doctorName = doctorName;
        this.patientName = patientName;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

//    public List getData(){
//        List data=new ArrayList();
//        Prescription pre=new Prescription();
//        data.add(0,pre.getPrescriptionId());
//        data.add(1,pre.getDescription());
//        data.add(2,pre.getDoctorName());
//        return data;
//    }
}
