package com.abhiram.app;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MyClassCTest {
    @InjectMocks
    MyClassC myclassC;

    @Mock
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;
    @BeforeEach
    void setUp(){
        myclassA=Mockito.mock(MyclassA.class);
        myclassB= Mockito.mock(MyclassB.class);
    }
    @Test
    public void TestMethod1() {
        //when(myclassC.getMyAge(anyInt())).thenReturn(35);
        int result = myclassC.getMyAge(25);
        assertEquals(25, result);
    }
}
