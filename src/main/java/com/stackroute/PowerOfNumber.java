package com.stackroute;

public class PowerOfNumber {

    public String checkForThePowerOfNumber(int input){

        if(input==0)
        return null;

        while(input !=1)
        {
            if(input%4!=0)

                return "it is not a power of 4";

                input=input/4;
            }
             return "it is a power of 4";

        }

    }

