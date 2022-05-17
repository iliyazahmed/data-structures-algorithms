package com.tns.practice;


import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.List;
import com.itextpdf.text.ListItem;
import com.itextpdf.text.pdf.PdfSignature;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ListPdfGeneration {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\iliyaz\\ListPdf.pdf");
            PdfWriter.getInstance(document,fileOutputStream);
            document.open();
            List orderedList = new List(List.ORDERED);
            orderedList.add(new ListItem("Spring Framework"));
            orderedList.add(new ListItem("Spring Framework"));
            orderedList.add(new ListItem("Spring Framework"));
            List unorderedList =  new List(List.UNORDERED);
            unorderedList.add(new ListItem("JPA with Hibernate"));
            unorderedList.add(new ListItem("JPA with Hibernate"));
            unorderedList.add(new ListItem("JPA with Hibernate"));

            document.add(orderedList);
            document.add(unorderedList);

            document.close();
            fileOutputStream.close();
        } catch (FileNotFoundException | DocumentException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
