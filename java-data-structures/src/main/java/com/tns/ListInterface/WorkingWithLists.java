package com.tns.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class WorkingWithLists {
    public static void main(String[] args) {
        List<String> playerName = new ArrayList<String>();
        playerName.add("kohli");
        playerName.add("dhoni");
        playerName.add("sachin");
        playerName.add("sehwag");

        List<String> playerName1 = new LinkedList<>();
        playerName1.add("Ab devillers");
        playerName1.add("Dale steyn");
        playerName1.add("Amla");

        List<String> unmodifiableList= List.of(
                "Gilchrist",
                "Pointing"
        );
        /* unmodifiable bcoz if we add any new elements it through exception...
           unmodifiableList.add("starc");
        */

        System.out.println(playerName.size());
        System.out.println(playerName.contains("kohli"));
        System.out.println(playerName.contains("yuvraj"));
        
        System.out.println(playerName);

        for (int i = 0; i < playerName.size() ; i++) {
            System.out.println(playerName);
        }
        for (String player:playerName) {
            System.out.println(player);
        }
        playerName.forEach(System.out::println);


    }
}
