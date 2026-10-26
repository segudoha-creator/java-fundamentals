
package se.lexicon.javaexercises;

import java.util.Scanner;

public class ExercisePart2_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String characters =
                "abcdefghijklmnopqrstuvwxyz" +
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "0123456789";

        System.out.print("Enter password length: ");
        int length = scanner.nextInt();

        if (length <= 0) {
            System.out.println("Password length must be greater than zero.");
            scanner.close();
            return;
        }

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = (int) (Math.random() * characters.length());
            password.append(characters.charAt(index));
        }

        System.out.println("Generated password: " + password);

        scanner.close();
    }
}
