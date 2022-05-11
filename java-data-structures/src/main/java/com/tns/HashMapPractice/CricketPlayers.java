package com.tns.HashMapPractice;

public class CricketPlayers {

    private String playerName;
    private Integer jerseyNumber;

    public CricketPlayers(String playerName, int jerseyNumber) {
        this.playerName = playerName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "CricketPlayers{" +
                "playerName='" + playerName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }
}
