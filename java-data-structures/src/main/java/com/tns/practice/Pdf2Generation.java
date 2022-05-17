package com.tns.practice;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Pdf2Generation {
    public static void main(String[] args) {
        String para = "Datadog offers different sites throughout the world. Each site is completely independent, and you cannot share data across sites. Each site gives you benefits (for example, government security regulations) or allows you to store your data in specific locations around the world.";
        Document document = new Document();
        try {
            OutputStream outputStream = new FileOutputStream("C:\\Users\\iliyaz\\pdf2generation.pdf");
            PdfWriter.getInstance(document,outputStream);
            document.open();
            Font font = new Font(Font.FontFamily.TIMES_ROMAN, 20,
                    Font.ITALIC | Font.UNDERLINE | Font.BOLD);
            Paragraph paragraph = new Paragraph(para,font);
            document.add(paragraph);
            document.close();
            outputStream.close();
        }
        catch (FileNotFoundException | DocumentException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
