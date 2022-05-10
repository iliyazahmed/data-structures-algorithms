package com.tns.practice;

public class SumOfNumbers {

    private void sumMethod(int num){
        int i = num * (num + 1) / num;
        System.out.println(i);
    }

    private int sum(int num){
      return num*(num+1)/num;
    }

    public static void main(String[] args) {
        SumOfNumbers sumOfNumbers = new SumOfNumbers();
        sumOfNumbers.sumMethod(5);
        System.out.println(sumOfNumbers.sum(10));
    }
}
