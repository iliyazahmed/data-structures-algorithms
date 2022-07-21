package com.tns.ArraysDataPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CRUDWithArray {
    private static void display(int[] intArray){
        System.out.print("Array : [");
        for (int j : intArray) {
            // display value of element at index i.
            System.out.print(" " + j);
        }
        System.out.println(" ]");
        System.out.println();
    }

    public static void insertOperation(int[] intArray){
        int i=0;
        while (i<intArray.length){
            intArray[i]=i;
            i++;
        }
        //insertion with array
//        for (int i = 0; i < intArray.length ; i++) {
//             intArray[i] = i;
//        }
     }
    public static void searchOperation(int value,int[] intArray){
        for (int j =0;j<intArray.length;j++){
            if(intArray[j]==value){
                int k = j+1;
                System.out.println("Value "+value +" found at position "+k);
                break;
            }
        }
    }

    public static void updateOperation(int[] intArray){
        int index = 5;
        intArray[index]=120;
        System.out.println("After updating element at index : "+index);
        display(intArray);
    }

    public static int[]  deleteOperation(int[] intArray,int index){
        if(intArray == null || index<0 ||index > intArray.length){
            return intArray;
        }
        else {
            List<Integer> arrayList =
                    IntStream.of(intArray).boxed().collect(Collectors.toList());
            arrayList.remove(index);
            return arrayList.stream().mapToInt(Integer::intValue).toArray();
        }

    }

    public static void main(String[] args) {
        int[] intArray ;
        intArray = new int[8]; //declare array size

        System.out.println("Array before adding elements");
        display(intArray);
        insertOperation(intArray);

        System.out.println("Array After adding elements");
        display(intArray);

        updateOperation(intArray);
        display(intArray);

        searchOperation(120,intArray);
        
        intArray = deleteOperation(intArray,1);
        System.out.println("Element removed at index "+Arrays.toString(intArray));

    }

}
