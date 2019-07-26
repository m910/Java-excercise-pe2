package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentGradesTest {
    StudentGrades studentGrades;

    @Before
    public void setUp() throws Exception {
        studentGrades=new StudentGrades();
    }

    @After
    public void tearDown() throws Exception {
        studentGrades=null;
    }

    @Test
    public void givenInputAndCheckingTheRangeOfGrades(){
        int[] grades={86,95,98,45};
        assertEquals("\"StudentGrades{\" +\n" +
                "                \"minimum=\" + min +\n" +
                "                \", maximum=\" + max +\n" +
                "                \", average=\" + avg +\n" +
                "                '}';\n" +
                "  ",studentGrades.checkingInvalidInput(4,grades));
    }
}