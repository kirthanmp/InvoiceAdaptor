package com.cp.invoiceadaptor;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;


public class CSVGenerator {
    public static void writeDataToCSV(String[] headers, String[][] data, String csvFilePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath))) {
            // Headers
            writer.writeNext(headers);
            // Data
            for (String[] row : data) {
                writer.writeNext(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
