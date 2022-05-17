package com.tns.StreamApiLearning;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    private static Stream<?> listStream;
    private static Stream<?> listStream2;

    private static void evenNumbers(int maximumNumber){
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i <= maximumNumber; i++) {
            arrayList.add(i);
        }
        Stream<Integer> integerStream = arrayList.stream();
        List<Integer> evenNumbers = integerStream.filter(i->i%2==0).
                collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) {
        listStream = Stream.of("Iliyaz",908,89.09,'D',true);
        listStream.forEach(System.out::println);

        Double[] decimalValues = {12.0,90.9,234.90};
        listStream2 = Stream.of(decimalValues);
        for (Double values : decimalValues
             ) {
            System.out.println(values);
        }

        evenNumbers(30);

    }
}
