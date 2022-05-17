package com.tns.practice;

public class SumOfNumbers {

    private int sum(int num){
      return num*(num+1)/2;
    }

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        System.out.println(sumOfNumbers.sum(100));
        String str = "java";
        String st1 = "python";
        String st2 = "java";
        System.out.println(str);
        System.out.println(st2);


    }
}
