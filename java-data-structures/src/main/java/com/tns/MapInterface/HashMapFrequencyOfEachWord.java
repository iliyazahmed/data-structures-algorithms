package com.tns.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapFrequencyOfEachWord {
    private  static  Map<Character,Integer> findFrequency;

    private static void findFrequencyOfWord(String sentence){
        sentence=sentence.toUpperCase();
        findFrequency = new HashMap<Character, Integer>();
        for (int i = 0; i < sentence.length(); i++) {
            Character character = sentence.charAt(i);
            findFrequency.computeIfPresent(character,(keySentence,count)->count+1);
            findFrequency.computeIfAbsent(character,(keySentence)->1);
        }
        System.out.println(findFrequency);
//        for (Map.Entry<Character,Integer> words:findFrequency.entrySet()) {
//            System.out.println(words);
//        }
    }
    public static void main(String[] args) {
    findFrequencyOfWord("ILOVEMYINDIA");
    findFrequencyOfWord("Mohammadiliyaz");
    }
}
