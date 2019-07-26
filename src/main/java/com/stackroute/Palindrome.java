package com.stackroute;

public class Palindrome {

    public String reverseAndCheckForPalindrome(String input){

        if(input==null)
            return null;

        String temp="";
        for(int i=input.length()-1;i>=0;i--){

            temp = temp+input.charAt(i);
        }

        if(input.equals(temp))

            return "input string is palindrome";

        else
            return "input string is not palindrome";
    }
}
