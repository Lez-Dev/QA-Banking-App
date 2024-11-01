package org.qa.Thursday.IO;

import java.io.*;

public class IORunner {
    public static void main(String[] args) {
        String filename = "Example.txt";

        // File writing
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello cohort 1\n This is a file\n");
            System.out.println("File writing successful");
        } catch (IOException e) {
            e.getMessage();
        }

        // File Reading
        try (FileReader reader = new FileReader(filename)) {

        } catch (IOException e) {
            e.getMessage();
        }
    }
}
