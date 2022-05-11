package com.tns.HashMapPractice;

import java.util.Comparator;

public class CricketPlayersComparator implements Comparator<CricketPlayers> {

    @Override
    public int compare(CricketPlayers c1, CricketPlayers c2) {
        return c2.getJerseyNumber().compareTo(c1.getJerseyNumber());
    }
}
