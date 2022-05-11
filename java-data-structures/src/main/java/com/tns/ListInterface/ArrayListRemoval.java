package com.tns.ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListRemoval {
    private static List<String> arrayList;

    private static List<String> arrayList1;

    private static void usingStreamAPIRemove(String countryName){
        //using stream Api
        List<String> filteredList = arrayList1.stream()
                .filter(name -> !name.equalsIgnoreCase(countryName))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }

    private static void usingListIteratorRemove(String countryName){
        //using list iterator
        ListIterator<String> listIterator = arrayList.listIterator();
        while (listIterator.hasNext()){
            if(listIterator.next().equalsIgnoreCase(countryName)){
                listIterator.remove();
            }
        }
        arrayList.forEach(System.out::println);
    }
    public static void main(String[] args) {
        arrayList = new ArrayList<>();
        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("South Africa");
        arrayList.add("England");

        arrayList1 = new ArrayList<>(
                List.of("WestIndies",
                        "Newzland",
                        "Europe",
                        "Ireland"));
        System.out.println(arrayList1);
        System.out.println(arrayList);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@");
        usingListIteratorRemove("England");
        System.out.println("---------------------------");
        usingStreamAPIRemove("ireland");






        /*for (String country : arrayList) {
            System.out.println(arrayList.remove(2));
        }
        it will throw concurrent modification exception
         */
    }
}
