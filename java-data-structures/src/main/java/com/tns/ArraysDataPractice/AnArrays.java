package com.tns.ArraysDataPractice;

import java.util.Arrays;
import java.util.Scanner;

public class AnArrays {
    public static void main(String[] args) {
        String[] iplTeam = new String[5];
        iplTeam[0]="SRH";
        iplTeam[1]="RCB";
        iplTeam[2]="CSK";
        iplTeam[3]="KKR";
        iplTeam[4]="MI";
        System.out.println("Length of the Array is "+iplTeam.length);

        for (int i=0;i<iplTeam.length;i++){
            System.out.print(iplTeam[i]+" ");
        }
        System.out.println(" ");
        for (int i = iplTeam.length-1; i >=0 ; i--) {
            System.out.print(iplTeam[i]+" ");
        }
        System.out.println(" ");
        for (String team: iplTeam) {
            System.out.print(team+" ");
        }
        Arrays.stream(iplTeam).forEach(System.out::println);

        int []jerseyNumbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the jersey numbers of players ");
        for (int i = 0; i < jerseyNumbers.length; i++) {
            jerseyNumbers[i]=scanner.nextInt();
        }
        for (int i = 0; i <jerseyNumbers.length ; i++) {
            System.out.print(jerseyNumbers[i]+" ");
        }

    }
}
