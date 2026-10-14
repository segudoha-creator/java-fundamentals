
package se.lexicon;

import java.util.Scanner;

public class ExercisePart2_6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().trim();

        int wordCount;

        if (sentence.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = sentence.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Word count: " + wordCount);

        scanner.close();
    }
}
