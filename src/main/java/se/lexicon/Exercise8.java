
package se.lexicon;

import java.io.FileWriter;
import java.io.IOException;

public class Exercise8 {

    public static void main(String[] args) {

        String text = "Hello! This is my first try-with-resources exercise.";

        try (FileWriter writer = new FileWriter("output.txt")) {

            writer.write(text);

            System.out.println("Text was written to the file successfully!");

        } catch (IOException e) {

            System.out.println("Error: Could not write to the file.");
        }
    }
}
