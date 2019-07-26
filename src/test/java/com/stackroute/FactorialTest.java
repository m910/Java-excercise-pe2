package com.stackroute;

import org.junit.*;
import  java.lang.*;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FactorialTest {

    Factorial factorial;

    @Before
    public void setUp() throws Exception {

        factorial=new Factorial();
    }

    @After
    public void tearDown() throws Exception {
        factorial=null;
    }

    @Test
    public void givenTheInputOfIntDataType(){

        assertNotEquals("Int Factorial",factorial.intFactorial());
        assertEquals("Long factorial",factorial.longFactorial());
    }

    @Test
    public void givenInputOfDataTypeLong(){
        assertEquals("Int factorial",factorial.intFactorial());
        assertEquals("Long factorial",factorial.longFactorial());
    }
}