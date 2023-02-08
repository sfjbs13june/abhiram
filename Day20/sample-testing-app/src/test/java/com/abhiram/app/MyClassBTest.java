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
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class MyClassBTest {
    @InjectMocks
    MyclassB myclassB;
    @Mock
    MyclassA myclassA;

    @Mock
    MyClassC myclassC;
    @BeforeEach
    void setUp(){
        myclassA= Mockito.mock(MyclassA.class);
        myclassC= Mockito.mock(MyClassC.class);
    }
    @Test
    public void TestMethod1() {
        String result = myclassB.getResult();
        assertEquals("my result", result);
    }
    @Test
    public void TestMethod2() {
        String result = myclassB.getMyString("hello");
        assertEquals("my result hello", result);
    }
    @Test
    public void TestMethod3() {
        when(myclassC.getMyAge(anyInt())).thenReturn(35);
        int result = myclassC.getMyAge(25);
        assertEquals(35, result);
    }
    @Test
    public void TestMethod4() {
        //  doNothing().when(myclassB).NoreturnData(anyString());
        myclassB.NoreturnData("my data");
        verify(myclassA, atLeast(0)).method6();
    }

}
