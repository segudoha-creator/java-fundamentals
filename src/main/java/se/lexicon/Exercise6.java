
package se.lexicon;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();

        try {

            validateEmail(email);

            System.out.println("Email address is valid!");

        } catch (IllegalArgumentException e) {

            System.out.println("Error: " + e.getMessage());

        } finally {
            scanner.close();
        }
    }

    public static void validateEmail(String email) {

        if (!email.contains("@")) {

            throw new IllegalArgumentException(
                    "Invalid email address. It must contain @."
            );
        }
    }
}
