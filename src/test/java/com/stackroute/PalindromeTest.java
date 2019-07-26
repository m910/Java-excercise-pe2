package com.stackroute;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.*;
import static org.junit.Assert.assertNotEquals;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {

        palindrome=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {

        palindrome=null;
    }

    @Test
    public void givenInputStringIsPalindrome(){
        assertEquals("input string is palindrome",palindrome.reverseAndCheckForPalindrome("asdsa"));
    }

    @Test
    public void givenInputStringIsNotPalindrome(){
        assertEquals("input string is not palindrome",palindrome.reverseAndCheckForPalindrome("London"));
    }

    @Test
    public void givenInputStringCheckingForPalindrome(){
        assertNotEquals("input string is palindrome",palindrome.reverseAndCheckForPalindrome("Paris"));
    }

    @Test

    public void nullInput(){
        assertNull(palindrome.reverseAndCheckForPalindrome(null));
    }
}