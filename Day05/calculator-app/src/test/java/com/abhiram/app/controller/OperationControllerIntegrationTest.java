package com.abhiram.app.controller;

import org.junit.Test;
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
@WebMvcTest(OperationController.class)
public class OperationControllerIntegrationTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testAdd() throws Exception{
        long x=30L;
        long y=15L;
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.get("/add").param("x",String.valueOf(x)).param("y",String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("45",result);
    }

    @Test
    public void testSub() throws Exception{
        long x=30L;
        long y=15L;
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.post("/sub").param("x",String.valueOf(x)).param("y",String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("15",result);
    }

    @Test
    public void testMul() throws Exception{
        long x=30L;
        long y=15L;
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.put("/mul").param("x",String.valueOf(x)).param("y",String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("450",result);
    }

    @Test
    public void testDiv() throws Exception{
        long x=30L;
        long y=15L;
        ResultActions responseEntity=mockMvc.perform(MockMvcRequestBuilders.delete("/div").param("x",String.valueOf(x)).param("y",String.valueOf(y)));
        responseEntity.andExpect(status().isOk());
        String result=responseEntity.andReturn().getResponse().getContentAsString();
        assertEquals("2",result);
    }
}
