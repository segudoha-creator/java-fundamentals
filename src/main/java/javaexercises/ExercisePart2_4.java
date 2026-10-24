
package javaexercises;

import java.util.Scanner;

public class ExercisePart2_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();

        String[] names = fullName.split("\\s+");

        StringBuilder initials = new StringBuilder();

        for (String name : names) {
            if (!name.isEmpty()) {
                initials.append(Character.toUpperCase(name.charAt(0)));
            }
        }

        System.out.println("Initials: " + initials);

        scanner.close();
    }
}
