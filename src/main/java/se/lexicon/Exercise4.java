package se.lexicon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Exercise4 {

    public static void main(String[] args) {

        Path path = Path.of("number.txt");

        try {

            String content = Files.readString(path);

            try {

                int number = Integer.parseInt(content.trim());

                System.out.println("The number in the file is: " + number);

            } catch (NumberFormatException e) {

                System.out.println("Error: The file does not contain a valid integer.");
            }

        } catch (NoSuchFileException e) {

            System.out.println("Error: The file was not found.");

        } catch (IOException e) {

            System.out.println("Error: Something went wrong while reading the file.");
        }
    }
}