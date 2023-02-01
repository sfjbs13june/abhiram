package com.mongo.app.controller;

public class Student {
    public Student(String name, String std, String roll) {
        this.name = name;
        this.std = std;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    String name;
    String std;

    String roll;
}
