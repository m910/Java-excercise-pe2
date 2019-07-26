package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfNumberTest {
    PowerOfNumber powerOfNumber;

    @Before
    public void setUp() throws Exception {
        powerOfNumber=new PowerOfNumber();
    }

    @After
    public void tearDown() throws Exception {
        powerOfNumber=null;
    }

    @Test
    public void givenInputIsPowerOf4(){
        assertEquals("it is a power of 4",powerOfNumber.checkForThePowerOfNumber(16));
    }

    @Test
    public void givenInputIsNotPowerOf4(){
        assertEquals("it is not a power of 4",powerOfNumber.checkForThePowerOfNumber(24));
    }

    @Test
    public void zeroInput(){
        assertNull(powerOfNumber.checkForThePowerOfNumber(0));
    }
}