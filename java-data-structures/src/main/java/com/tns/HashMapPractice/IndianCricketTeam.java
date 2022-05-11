package com.tns.HashMapPractice;

import java.util.*;

public class IndianCricketTeam {
    public static void main(String[] args) {
        Map<String,Double> treeMap = new TreeMap<>(Collections.reverseOrder());
        treeMap.put("Rohit",15.00);
        treeMap.put("Dhawan",12.00);
        treeMap.put("Rahul",15.00);

        for (Map.Entry<String ,Double> pla:treeMap.entrySet()
             ) {
            System.out.println(pla);
        }
        List linkedList = new LinkedList<>(List.of(
                "Iliyaz",
                23,
                90.9
        ));
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

    }
}
