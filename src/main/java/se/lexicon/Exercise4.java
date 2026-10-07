package se.lexicon;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter third number: ");
        int third = scanner.nextInt();

        double average = (first + second + third) / 3.0;

        System.out.println("Average: " + average);

        scanner.close();
    }
}