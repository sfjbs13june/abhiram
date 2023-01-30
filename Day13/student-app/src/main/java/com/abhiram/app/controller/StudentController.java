package com.abhiram.app.controller;

import com.abhiram.app.model.Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class StudentController {
    public Optional<Student> getStudents(String name){
        Map<String,Student> studentMap=new HashMap();
        Student student1=new Student("vamsi","1","8th","sasi");
        Student student2=new Student("harsha","5","8th","sasi");
        Student student3=new Student("apoorv","39","9th","sasi");
        Student student4=new Student("subash","38","9th","sasi");

        studentMap.put(student1.getName(),student1);
        studentMap.put(student2.getName(),student2);
        studentMap.put(student3.getName(),student3);
        studentMap.put(student4.getName(),student4);
        Student result=studentMap.get(name);
        return Optional.ofNullable(result);
    }
}
