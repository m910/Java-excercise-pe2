package com.stackroute;

public class Factorial {

    public String intFactorial() {

        int i = 1;
        int fact = 1;
        System.out.println("Int factorials:");
        while (true) {
            System.out.printf("The factorial of %1$d is is %2$d.\n", i, fact);
            if (Integer.MAX_VALUE / fact < (i + 1)) {
                System.out.printf("The factorial of %d is out of range.\n", (i + 1));
                break;
            }
            i++;
            fact = fact * i;
        }
        return "Int factorial";
    }

    public String longFactorial(){

        long num=1L,fact=1L;
        System.out.println("Long factorials:");
        while (true)
        {
            System.out.printf("The factorial of %1$d is is %2$d.\n", num, fact);
            if (Long.MAX_VALUE / fact < (num+1)) {
                System.out.printf("The factorial of %d is out of range.\n", (num+1));
                break;
            }
            num++;
            fact = fact * num;
        }
        return "Long factorial";
    }
}

