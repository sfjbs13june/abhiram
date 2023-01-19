package com.abhiram.app.controller;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class OperationControllerTest {
    OperationController operationController=new OperationController();

    @Test
    public void testAdd(){
        long x= 30L;
        long y= 15L;
        long expectedResult=x+y;
        long result= operationController.add(x,y);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testSub(){
        long x=30L;
        long y=15L;
        long expectedResult=x-y;
        long result= operationController.sub(x,y);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testMul(){
        long x=30L;
        long y=15L;
        long expectedResult=x*y;
        long result= operationController.mul(x,y);
        Assert.assertEquals(expectedResult,result);
    }

    @Test
    public void testDiv(){
        long x=30L;
        long y=15L;
        long expectedResult=x/y;
        long result= operationController.div(x,y);
        Assert.assertEquals(expectedResult,result);
    }

}
