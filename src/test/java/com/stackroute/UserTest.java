package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
        user=new User();
    }

    @After
    public void tearDown() throws Exception {
        user=null;
    }

    @Test
    public void givenInputToGetTheOutput(){
        assertEquals("within specified range",user.isValidAge(23));
        assertEquals("Gorge S",user.getFullName("Gorge","S"));
    }

    @Test
    public void givenInputForGettingValidOutput(){
        assertEquals("Not within specified range",user.isValidAge(80));
        assertEquals("Nick Jonas",user.getFullName("Nick","Jonas"));
    }

    @Test
    public void givenInputForGettingOutput(){
        assertNotEquals("Within specified range",user.isValidAge(89));
        assertNotEquals("Nick",user.getFullName("Nick","george"));
    }
}