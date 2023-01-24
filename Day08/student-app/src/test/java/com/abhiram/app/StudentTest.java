package com.abhiram.app;

import com.abhiram.app.controller.StudentController;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class StudentTest {
    StudentController studentController=new StudentController();

    @Test
    public void testList(){
        String listSize= String.valueOf(studentController.getStudents().size());
        Assert.assertEquals("4",listSize);
    }
    @Test
    public void testMap(){
        String mapSize=String.valueOf(studentController.mapstudents().size());
        Assert.assertEquals("4",mapSize);
    }
}
