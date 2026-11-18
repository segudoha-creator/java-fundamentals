
package se.lexicon;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        try {
            readNumber(scanner);

        } catch (InputMismatchException e) {

            System.out.println("Error: Please enter a valid integer.");

        } catch (NumberOutOfRangeException e) {

            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static void readNumber(Scanner scanner)
            throws NumberOutOfRangeException {

        System.out.print("Enter an integer between 1 and 100: ");

        int number = scanner.nextInt();

        if (number < 1 || number > 100) {

            throw new NumberOutOfRangeException(
                    "The number must be between 1 and 100.");

        }

        System.out.println("Your number is valid: " + number);

    }
}
