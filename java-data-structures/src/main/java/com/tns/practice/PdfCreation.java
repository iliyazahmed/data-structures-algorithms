package com.tns.practice;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfCreation {
    public static void main(String[] args) throws IOException {
        Document document = new Document();
        File file = new File("C:\\Users\\iliyaz\\springnotes.pdf");
        FileOutputStream fileOutputStream;
        try  {
            fileOutputStream = new FileOutputStream(file);
            PdfWriter.getInstance(document, fileOutputStream);
            // open the document
            document.open();
            // add info in pdf
            document.add(
                    new Paragraph("This Spring Notes about Contains Concepts like" + " IOC container," +
                            "Dependency Injection ,Aop Programming"));
            System.out.println("Pdf Created is successful");
        } catch (FileNotFoundException | DocumentException e) {
            throw new RuntimeException(e);
        } finally {
            document.close();
        }
    }
}
