package com.tns.ListInterface;

import java.lang.ref.PhantomReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

public class ArrayListRemoval {
    private static List<String> arrayList;

    private static List<String> arrayList1;

    private static void usingStreamAPI(String countryName){
        //using stream api's
        List<String> filteredList = arrayList.stream()
                .filter(country->!arrayList.equals(countryName))
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }

    private static void usingListIterator(String countryName){
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
        arrayList = new ArrayList<String>();
        arrayList.add("India");
        arrayList.add("Australia");
        arrayList.add("South Africa");
        arrayList.add("England");

        arrayList1 = new ArrayList<>(
                List.of("WestIndies",
                        "Newzland",
                        "Europe",
                        "Ireland"));
        usingListIterator("England");
        
        //usingStreamAPI("South Africa");





        /*for (String country : arrayList) {
            System.out.println(arrayList.remove(2));
        }
        it will throw concurrent modification exception
         */
    }
}
