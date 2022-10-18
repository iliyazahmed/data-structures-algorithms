package com.tns.recursion;

import org.jetbrains.annotations.NotNull;

import static java.lang.System.*;

public class Factorial {

    private static int recursiveFactorial(int number){
        if (number==0){
            return 1;
        }else {
            return number * recursiveFactorial(number - 1);
        }
    }
    private static void byLiteralWay(int num){
        long start = System.currentTimeMillis();
        int temp = 1;
        for(int i=1;i<=num;i++){
            temp = temp*i;
        }
        out.println("The Factorial of "+num+" is :"+temp);
        long end = System.currentTimeMillis();
        out.println("Time taken BY Literal way : "+(end-start));
    }
    private static void reverseString(@NotNull String element){
        StringBuilder reverse = new StringBuilder();
        for (int i=element.length()-1;i>=0;i--){
            reverse.append(element.charAt(i));
        }
        out.println(element+" after reversing : "+reverse);
    }

    private static void fibanocciSeries(Integer number){
        long start = currentTimeMillis();
     int a=0;
        int b=0;
        int c=1;
        for (int i = 0; i < number; i++) {
            a=b;
            b=c;
            c=a+b;
            out.print(a+" ,");
        }
        long end = currentTimeMillis();
        out.println("Time Taken for fibanocci series by literal way  : "+(end-start));
    }

    public static void main(String[] args) {
        long start = currentTimeMillis();
        out.println("Factorial of Given Number with Recursive : "+recursiveFactorial(19));
        long end = currentTimeMillis();
        out.println("Time Taken for Recursive Method is : "+(end-start));
        byLiteralWay(19);
        reverseString("Bengaluru");
        fibanocciSeries(20);

    }
}
