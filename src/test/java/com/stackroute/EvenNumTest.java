package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class EvenNumTest {

    EvenNum evenNum;

    @Before
    public void setUp() throws Exception {

        evenNum=new EvenNum();
    }



    @After
    public void tearDown() throws Exception {

        evenNum=null;
    }

    @Test
    public void givenNumberIsEven(){
        assertEquals(true,evenNum.isEven(6));
    }

    @Test
    public void givenNumberIsOdd(){
        assertEquals(false,evenNum.isEven(7));
    }

    @Test
    public void givenNumberIsNotEven(){
        assertNotEquals(true,evenNum.isEven(9));
    }


}