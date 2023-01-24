package com.abhiram.app.controller;

import com.abhiram.app.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class StudentController {
    @GetMapping("/get/students")
    public List<Student> getStudents(){
        List listStudents=new ArrayList();
        Student student1=new Student("vamsi","1","8th","sasi");
        Student student2=new Student("harsha","5","8th","sasi");
        Student student3=new Student("apoorv","39","9th","sasi");
        Student student4=new Student("subash","38","9th","sasi");

        listStudents.add(student1);
        listStudents.add(student2);
        listStudents.add(student3);
        listStudents.add(student4);
        return listStudents;
    }

    @GetMapping("/map/students")
    public Map mapstudents(){
        Map studentMap=new HashMap();
        Student student1=new Student("vamsi","1","8th","sasi");
        Student student2=new Student("harsha","5","8th","sasi");
        Student student3=new Student("apoorv","39","9th","sasi");
        Student student4=new Student("subash","38","9th","sasi");

        studentMap.put(student1.getRoll(),student1);
        studentMap.put(student2.getRoll(),student2);
        studentMap.put(student3.getRoll(),student3);
        studentMap.put(student4.getRoll(),student4);
        return studentMap;
    }
}
