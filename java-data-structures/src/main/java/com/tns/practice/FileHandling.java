package com.tns.practice;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    private static void createFileMethod(){
        File file = new File("C:\\Users\\iliyaz\\signature.txt");
        try {
            if(file.createNewFile()){
                System.out.println("text file is created successfully");
            }
            else {
                System.out.println("text file is not createD");
            }
        }
        catch (IOException e) {
            System.out.println("text file is not created ");
            e.printStackTrace();
        }
    }

    private static void fileWriterMethod()  {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\iliyaz\\happy.txt");
            fileWriter.write("This file is created for generating signature \n Signature");
            fileWriter.close();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void readFileMethod(){
        File file = new File("C:\\Users\\iliyaz\\happy.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteFileMethod(){
        File file = new File("C:\\Users\\iliyaz\\happy.txt");
        if (file.delete()){
            System.out.println("File has Successfully deleted");
        }
        else{
            System.out.println("File has been not deleted");
        }
    }
    public static void main(String[] args) {
        createFileMethod();
        fileWriterMethod();
        readFileMethod();
        deleteFileMethod();

    }
}
