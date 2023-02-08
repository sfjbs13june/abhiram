package com.abhiram.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyclassB {

    public String getResult(){
        return "my result";
    }

    public String getMyString(String data){
        return "my result "+ data;
    }

    public int getClassCRestult(MyClassC myClassC){
        return  myClassC.getMyAge(25);
    }

    public void NoreturnData(String data){
        System.out.println(data);

    }


}
