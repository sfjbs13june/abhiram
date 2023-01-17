package com.abhiram.app;

import org.junit.Assert;
import org.junit.jupiter.api.Test;


public class CalculatorControllerTest {
    CalculatorController calculatorController=new CalculatorController();

    @Test
    public void testAdd(){
        double x=20;
        double y=10;
        double expectedResult=x+y;
        double result=calculatorController.add(x,y);
        Assert.assertEquals(expectedResult, result,0.00);
    }
    @Test
    public void testSub(){
        double x=20;
        double y=10;
        double expectedResult=x-y;
        double result=calculatorController.sub(x,y);
        Assert.assertEquals(expectedResult, result,0.00);
    }
    @Test
    public void testMul(){
        double x=20;
        double y=10;
        double expectedResult=x*y;
        double result=calculatorController.mul(x,y);
        Assert.assertEquals(expectedResult, result,0.00);
    }
    @Test
    public void testDiv(){
        double x=20;
        double y=10;
        double expectedResult=x/y;
        double result=calculatorController.div(x,y);
        Assert.assertEquals(expectedResult, result,0.00);
    }
}
