package com.tns.ArraysDataPractice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnArray {

    private static void reverseAnArray(int[] arr,int start,int end){
        int temp;
        while (start<end){
            temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
    private static void reverseStringArray(String[] stringArray){

        for (int i = 0; i < stringArray.length/2; i++) {
            String temp = stringArray[i];
            stringArray[i]=stringArray[stringArray.length-1-i];
            stringArray[stringArray.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(stringArray));
    }
    private static int sumOfNumber(int number){
        int sum=0;
        while(number!=0){
            sum = sum+number%10;
            number = number/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10,23,43,22,9,12};
        int[] arr1 = {123,321,1222,345,6765,1239,342};
        try {
            reverseAnArray(arr, 0, 5);
            System.out.println("\n");
            reverseAnArray(arr1, 1, 6);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        int number = 1234;
        System.out.println("\nThe Sum of Given Number "+number+" is :"+sumOfNumber(number));

        String[] stringArrays ={"Facebook","Google","Microsoft","Amazon"};
        reverseStringArray(stringArrays);

        final String[] streamApi = stringArrays;
        Object[] reverseThroughStreamApi = IntStream.rangeClosed(1,streamApi.length).
                mapToObj(i ->streamApi[streamApi.length-i]).toArray();
        System.out.println("Reverse Array Using Stream API's "+Arrays.toString(reverseThroughStreamApi));
    }


}
