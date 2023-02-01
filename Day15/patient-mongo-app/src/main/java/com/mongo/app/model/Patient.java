package com.mongo.app.model;

public class Patient {
    String name;
    String patId;
    int age;
    String gender;
    String disease;
    public Patient(){

    }

    public Patient(String name, String patId, int age, String gender, String disease) {
        this.name = name;
        this.patId = patId;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
    }

    public String getName() {
        return name;
    }

    public String getPatId() {
        return patId;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDisease() {
        return disease;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatId(String patId) {
        this.patId = patId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }
}
