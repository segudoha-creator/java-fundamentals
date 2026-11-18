
package se.lexicon;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int number2 = scanner.nextInt();

        try {
            int result = number1 / number2;

            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {

            System.out.println("Error: You cannot divide by zero!");
        }

        scanner.close();
    }
}
