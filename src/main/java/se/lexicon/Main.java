package se.lexicon;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Alex";
        int age = 25;
        String city = "Stockholm";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        if (year % 400 == 0)  {
            System.out.println("Leap year");
        } else if (year % 100 == 0) {
            System.out.println("Not a leap year");
        } else if (year % 4 == 0) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        scanner.close();


    }
}
