package com.tns.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSet {
    public static void main(String[] args) {
        /*   doesn't allows null values
        *    and ignores duplicate values
        */
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Iliyaz");
        treeSet.add("Ab devillers");
        treeSet.add("Kohli");
        treeSet.add("Kane");
        for (String name: treeSet) {
            System.out.println(name);
        }

        /*
        Ignore duplicates and allows only one null value

         */
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(100);
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add(200);
        hashSet.add(140);
        hashSet.add(190);
        for (Integer numbers:hashSet) {
            System.out.println(numbers);
        }


        Set<Character> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add('Q');
        linkedHashSet.add(null); // allows null value
        linkedHashSet.add('W');
        linkedHashSet.add('E');
        linkedHashSet.add('R');
        for (Character characters:linkedHashSet) {
            System.out.println(characters);
        }
    }
}
