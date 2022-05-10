package com.tns.MapInterface;

import java.util.*;

public class WorkingWithMap {

    private static void hashMapMethod(){
        Map<Integer,String> hashMap = new HashMap<>();
        hashMap.put(18,"Kohli");
        hashMap.put(7,"Dhoni");   // it allows duplicates but prints only one
        hashMap.put(8,"Dhoni");
        hashMap.put(7,"Yuvraj");
        hashMap.put(10,"Sachin");
        hashMap.put(99,"Sehwag");
        for (Map.Entry<Integer,String> playerName: hashMap.entrySet()) {
            System.out.println(playerName.getKey()+" :"+playerName.getValue());
        }
    }

    private static void linkedHashMapMethod(){
        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"India");
        linkedHashMap.put(2,"Australia");
        linkedHashMap.put(3,"England");
        linkedHashMap.put(4,"Newzland");
        linkedHashMap.put(1,"India");
        for (Map.Entry<Integer,String> countryName: linkedHashMap.entrySet()) {
            System.out.println(countryName);
        }
    }
    private static void treeMapMethod() {
        Map<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("Google",1);
        treeMap.put("Microsoft",3);
        treeMap.put("Apple",4);
        treeMap.put("Facebook",10);
        treeMap.put("Amazon",12);
        for (Map.Entry<String,Integer> companyName:treeMap.entrySet()) {
            System.out.println(companyName);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hash Map Player Jersery Numbers");
        hashMapMethod();
        System.out.println("LinkedHashMap Country Names and ranking");
        linkedHashMapMethod();
        System.out.println("TreeMap Top it Companies and Ranking");
        treeMapMethod();
    }
}
