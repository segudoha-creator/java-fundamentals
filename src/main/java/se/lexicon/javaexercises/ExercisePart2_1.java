
package se.lexicon.javaexercises;

import java.util.Scanner;

public class ExercisePart2_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        StringBuilder reversed = new StringBuilder(word);
        reversed.reverse();

        System.out.println("Reversed: " + reversed);

        scanner.close();
    }
}
