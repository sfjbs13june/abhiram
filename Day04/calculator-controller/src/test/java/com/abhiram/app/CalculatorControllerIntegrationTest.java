package com.abhiram.app;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CalculatorController.class)
public class CalculatorControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCalculatorControllerAdd() throws Exception{
        String x="20";
        String y="10";
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.get("/add").param("x", String.valueOf(x)).param("y", String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("30.0",result);
    }
    @Test
    public void testCalculatorControllerSub() throws Exception{
        String x="20";
        String y="10";
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.get("/sub").param("x", String.valueOf(x)).param("y", String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("10.0",result);
    }
    @Test
    public void testCalculatorControllerMul() throws Exception{
        String x="20";
        String y="10";
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.get("/mul").param("x", String.valueOf(x)).param("y", String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("200.0",result);
    }
    @Test
    public void testCalculatorControllerDiv() throws Exception{
        String x="20";
        String y="10";
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.get("/div").param("x", String.valueOf(x)).param("y", String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        System.out.println(result);
        assertEquals("2.0",result);
    }
}
