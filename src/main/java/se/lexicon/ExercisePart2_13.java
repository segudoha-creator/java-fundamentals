
package se.lexicon;

import java.util.Scanner;

public class ExercisePart2_13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder receipt = new StringBuilder();
        double grandTotal = 0.0;

        while (true) {
            System.out.print("Enter item name (or 'done'): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("done")) {
                break;
            }

            System.out.print("Enter price: ");
            double price = Double.parseDouble(scanner.nextLine());

            receipt.append(String.format("%-20s %8.2f%n", itemName, price));
            grandTotal += price;
        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("           Receipt");
        System.out.println("==============================");
        System.out.print(receipt);
        System.out.println("------------------------------");
        System.out.printf("%-20s %8.2f%n", "Grand Total:", grandTotal);
        System.out.println("==============================");

        scanner.close();
    }
}
