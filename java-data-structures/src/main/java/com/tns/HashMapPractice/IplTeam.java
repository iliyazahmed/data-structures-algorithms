package com.tns.HashMapPractice;

import java.util.Map;
import java.util.TreeMap;

public class IplTeam {
    public static void main(String[] args) {
        Map<CricketPlayers,String> treeMap = new TreeMap<>(new CricketPlayersComparator());
        treeMap.put(new CricketPlayers("Dhoni",7),"CSK");
        treeMap.put(new CricketPlayers("Kohli",18),"RCB");
        treeMap.put(new CricketPlayers("Kane",22),"SRH");
        treeMap.put(new CricketPlayers("Rohit",45),"MI");

        for (Map.Entry<CricketPlayers,String> players:treeMap.entrySet()) {
            System.out.println(players.getKey()+" : "+players.getValue());
        }

    }
}
