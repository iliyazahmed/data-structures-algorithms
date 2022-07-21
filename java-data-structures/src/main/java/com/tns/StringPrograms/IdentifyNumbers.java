package com.tns.StringPrograms;

public class IdentifyNumbers {
    private static boolean isOnlyCharacters(String str) {
        return (str != null) && (!str.equals("")) && (str.chars().allMatch(Character::isAlphabetic));
    }

    public static void main(String[] args) {
        System.out.println("Testing the Values");
        String str1 = "GeeksForGeeks";
        System.out.println("Given Input is : "+str1);
        System.out.println("Output is :"+isOnlyCharacters(str1));
        System.out.println("-----------------------------------");
        String str2="Geeks4Geeks";
        System.out.println("Given Input is : "+str2);
        System.out.println("Output is :"+isOnlyCharacters(str2));


    }
}
