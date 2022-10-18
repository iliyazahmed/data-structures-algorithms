package com.tns.leetcodeprograms;

import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Roman Number to Convert into Numerical Form");
        String input = scanner.next();
        System.out.println(romanToInteger(input.toUpperCase()));
    }
    private static int romanToInteger(String input){
        int length = input.length();
        int result = 0;
        int i = 0;
        while (i<length){
            if(i == length-1){
                result = result+getInteger(input.charAt(i));
                return result;
            }
            int current = getInteger(input.charAt(i));
            int next = getInteger(input.charAt(i+1));
            if(current >= next){
                result = result+current;
                i++;
            }else {
                result = result+next-current;
                i=i+2;
            }
        }
        return result;
    }
    private static int getInteger(char ch){
        return switch (ch) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> -1;
        };
    }
}
