package se.lexicon;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Hello, " + firstName + " " + lastName + "!");

        scanner.close();
    }
}