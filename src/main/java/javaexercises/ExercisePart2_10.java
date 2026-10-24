
package javaexercises;

import java.util.Scanner;

public class ExercisePart2_10 {

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static int findMin(int a, int b, int c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int first = scanner.nextInt();

        System.out.print("Enter second number: ");
        int second = scanner.nextInt();

        System.out.print("Enter third number : ");
        int third = scanner.nextInt();

        System.out.println("Maximum : " + findMax(first, second, third));
        System.out.println("Minimum : " + findMin(first, second, third));
        System.out.printf("Average : %.2f%n", average(first, second, third));

        scanner.close();
    }
}
