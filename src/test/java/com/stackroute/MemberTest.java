package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberTest {
    MemberVariable member;

    @Before
    public void setUp() throws Exception {

        member=new MemberVariable();
    }

    @After
    public void tearDown() throws Exception {
        member=null;
    }

    @Test
    public void givenInputVariable(){
        assertEquals("Member{name='Harry Potter', age=30, salary=2500.3}",member.memberVariable("Harry Potter", 30, 2500.3));
    }


    @Test
    public void givenInputDoesNotInitialize(){
        assertNotEquals("Member{name='Harry Potter', age=0, salary=2500.3}",member.memberVariable("Harry Potter",30,2500.3));

    }
}