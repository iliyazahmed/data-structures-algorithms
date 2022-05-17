package com.tns.practice;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.util.Date;

public class PdfSignature {
    private static void addDigtalSignature(ByteArrayOutputStream byteArrayOutputStream) throws DocumentException {
        String file = "C:\\Users\\iliyaz\\Downloads\\signature-converted.pdf";
        Document document = new Document();
        PdfWriter pdfWriter = PdfWriter.getInstance(document,byteArrayOutputStream);
        PdfDocument pdfDocument = new PdfDocument();

    }
    public static void main(String[] args) throws DocumentException {

        try {
            //Create PdfReader instance.
            PdfReader pdfReader =
                    new PdfReader("C:\\Users\\iliyaz\\Downloads\\signature-converted.pdf");

            //Create PdfStamper instance.
            PdfStamper pdfStamper = new PdfStamper(pdfReader,
                    new FileOutputStream("C:\\Users\\iliyaz\\Downloads\\ModifiedTestFile.pdf"));

            //Create BaseFont instance.
            BaseFont baseFont = BaseFont.createFont(
                    BaseFont.TIMES_ROMAN,
                    BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

            //Get the number of pages in pdf.
            //int pages = pdfReader.getNumberOfPages();

            //Iterate the pdf through pages.
            for(int i=1; i<=pdfReader.getNumberOfPages(); i++) {
                //Contain the pdf data.
                PdfContentByte pageContentByte =
                        pdfStamper.getOverContent(i);

                pageContentByte.beginText();
                //Set text font and size.
                pageContentByte.setFontAndSize(baseFont, 14);

                pageContentByte.setTextMatrix(450, 250);

                //Write text
                pageContentByte.showText("Think n Solutions");
                pageContentByte.showText("Hsr Layout 7th Sector");
                pageContentByte.showText("Bangalore,Karnataka");
                pageContentByte.endText();
            }

            //Close the pdfStamper.
            pdfStamper.close();

            System.out.println("PDF modified successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
