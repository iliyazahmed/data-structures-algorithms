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

//        System.out.println(str);
//        System.out.println(st2);
        String s2 = "";
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            s2 = s2+ch;
        }
        System.out.println(s2);





    }
}
