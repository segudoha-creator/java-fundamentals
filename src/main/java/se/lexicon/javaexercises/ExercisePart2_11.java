
package se.lexicon.javaexercises;

import java.util.Scanner;

public class ExercisePart2_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many rolls? ");
        int numberOfRolls = scanner.nextInt();

        int doublesCount = 0;

        for (int i = 1; i <= numberOfRolls; i++) {
            int die1 = (int) (Math.random() * 6) + 1;
            int die2 = (int) (Math.random() * 6) + 1;
            int total = die1 + die2;

            System.out.print("Roll " + i + ": " + die1 + " + " + die2 + " = " + total);

            if (die1 == die2) {
                System.out.print("  DOUBLE!");
                doublesCount++;
            }

            System.out.println();
        }

        System.out.println("Doubles rolled: " + doublesCount + " out of " + numberOfRolls);

        scanner.close();
    }
}
