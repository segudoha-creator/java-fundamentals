
package se.lexicon;

import java.util.Scanner;

public class Exercise13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter day: ");
        String day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" ->
                    System.out.println("Weekday");

            case "Saturday", "Sunday" ->
                    System.out.println("Weekend");

            default ->
                    System.out.println("Unknown day");
        }

        scanner.close();
    }
}