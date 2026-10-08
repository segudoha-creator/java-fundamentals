package se.lexicon;

import java.util.Scanner;

public class CafeApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome! What is your name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + "! Here is our menu:");

        displayMenu();

        System.out.print("Enter item number (1-5): ");
        int itemNumber = scanner.nextInt();

        System.out.print("How many? ");
        int quantity = scanner.nextInt();

        System.out.print("Loyalty member? (yes/no): ");
        String loyaltyAnswer = scanner.next();

        String itemName = getItemName(itemNumber);

        double unitPrice = getItemPrice(itemNumber);

        double subtotal = calculateSubtotal(unitPrice, quantity);

        double discount = calculateDiscount(subtotal, loyaltyAnswer);

        double priceAfterDiscount = subtotal - discount;

        double vat = calculateVat(priceAfterDiscount);

        double total = calculateTotal(priceAfterDiscount, vat);

        printReceipt(name, itemName, quantity, subtotal, discount, vat, total);

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("==============================");
        System.out.println("       Lexicon Cafe");
        System.out.println("==============================");
        System.out.println("1. Espresso         25.00 SEK");
        System.out.println("2. Cappuccino       35.00 SEK");
        System.out.println("3. Latte            40.00 SEK");
        System.out.println("4. Croissant        30.00 SEK");
        System.out.println("5. Sandwich         55.00 SEK");
        System.out.println("==============================");
    }

    public static String getItemName(int itemNumber) {
        if (itemNumber == 1) {
            return "Espresso";
        } else if (itemNumber == 2) {
            return "Cappuccino";
        } else if (itemNumber == 3) {
            return "Latte";
        } else if (itemNumber == 4) {
            return "Croissant";
        } else {
            return "Sandwich";
        }
    }

    public static double getItemPrice(int itemNumber) {
        if (itemNumber == 1) {
            return 25.00;
        } else if (itemNumber == 2) {
            return 35.00;
        } else if (itemNumber == 3) {
            return 40.00;
        } else if (itemNumber == 4) {
            return 30.00;
        } else {
            return 55.00;
        }
    }

    public static double calculateSubtotal(double unitPrice, int quantity) {
        return unitPrice * quantity;
    }

    public static double calculateDiscount(double subtotal, String loyaltyAnswer) {
        if (loyaltyAnswer.equalsIgnoreCase("yes")) {
            return subtotal * 0.15;
        } else if (subtotal > 150) {
            return subtotal * 0.10;
        } else {
            return 0;
        }
    }

    public static double calculateVat(double priceAfterDiscount) {
        return priceAfterDiscount * 0.12;
    }

    public static double calculateTotal(double priceAfterDiscount, double vat) {
        return priceAfterDiscount + vat;
    }

    public static void printReceipt(
            String name,
            String itemName,
            int quantity,
            double subtotal,
            double discount,
            double vat,
            double total) {

        System.out.println();
        System.out.println("==============================");
        System.out.println("      LEXICON CAFE");
        System.out.println("==============================");
        System.out.println("Customer  : " + name);
        System.out.println("Item      : " + itemName + " x " + quantity);
        System.out.printf("Subtotal  : %.2f SEK%n", subtotal);
        if (discount > 0) {
            System.out.printf("Discount  : -%.2f SEK%n", discount);
        }
        System.out.printf("VAT       : %.2f SEK%n", vat);
        System.out.println("------------------------------");
        System.out.printf("TOTAL     : %.2f SEK%n", total);
        System.out.println("==============================");
        System.out.println("   Thank you, " + name + "!");
        System.out.println("   See you next time.");
        System.out.println("==============================");
    }
}