
package javaexercises;

import java.util.Scanner;

public class ExercisePart2_5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim();

        String cleanedWord = word.toLowerCase();

        String reversedWord = new StringBuilder(cleanedWord)
                .reverse()
                .toString();

        if (cleanedWord.equals(reversedWord)) {
            System.out.println("It is a palindrome!");
        } else {
            System.out.println("It is not a palindrome.");
        }

        scanner.close();
    }
}
