package com.tns.SetInterface;

import java.util.*;

public class CompanyNames {
    private static Set<?> hashSet;
    private static Set<String> treeSet;
    private static Set<?> linkedHashSet;
    public static void main(String[] args) {
         hashSet = new HashSet<>(
                 List.of("Google","Amazon","Facebook","Apple",19)
         );
        for (Object companyName : hashSet
             ) {
            System.out.println(companyName);
        }


        System.out.println("*******************************");
        treeSet = new TreeSet<>(
                 List.of("Google","Amazon","Facebook","Apple")
         );
        for (Object companyName:treeSet
             ) {
            System.out.println(companyName);
        }

        System.out.println("*******************************");
        linkedHashSet = new LinkedHashSet<>(
                 List.of("Google","Amazon","Facebook","Apple",19)
         );
        /*
         for (Object companyName:linkedHashSet) {
            System.out.println(companyName);
        }*/
        linkedHashSet.forEach(System.out::println);


    }
}
