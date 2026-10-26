
package se.lexicon.javaexercises;

import java.util.Scanner;

public class ExercisePart2_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        int atPosition = email.indexOf('@');

        String username = email.substring(0, atPosition);
        String domain = email.substring(atPosition + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain  : " + domain);

        scanner.close();
    }
}
