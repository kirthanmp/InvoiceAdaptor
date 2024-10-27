package com.cp.invoiceadaptor;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;

public class PDFReader {
    public static String extractTextFromPDF(String filepath) {
        String text = "";
        try (PDDocument document = PDDocument.load(new File(filepath))) {
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            text = pdfTextStripper.getText(document);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text;
    }
}
