
package se.lexicon;

import java.util.Scanner;

public class ConverterApp {

    // Main program and menu
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("==================================");
            System.out.println("      LEXICON CONVERTER APP");
            System.out.println("==================================");
            System.out.println("1. Temperature Converter");
            System.out.println("2. Currency Converter");
            System.out.println("3. BMI Calculator");
            System.out.println("4. Exit");
            System.out.println("==================================");

            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    temperatureConverter(scanner);
                    break;

                case 2:
                    currencyConverter(scanner);
                    break;

                case 3:
                    bmiCalculator(scanner);
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-4.");
            }

            System.out.println();
        }

        scanner.close();
    }

    // Temperature converter
    public static void temperatureConverter(Scanner scanner) {
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion: ");

        int tempChoice = scanner.nextInt();

        if (tempChoice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = (celsius * 9 / 5) + 32;

            System.out.printf("%.2f Celsius = %.2f Fahrenheit%n",
                    celsius, fahrenheit);

        } else if (tempChoice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = (fahrenheit - 32) * 5 / 9;

            System.out.printf("%.2f Fahrenheit = %.2f Celsius%n",
                    fahrenheit, celsius);

        } else {
            System.out.println("Invalid temperature conversion choice.");
        }
    }

    // Currency converter
    public static void currencyConverter(Scanner scanner) {
        final double USD_TO_SEK = 10.50;

        System.out.println("--- Currency Converter ---");
        System.out.println("1. USD to SEK");
        System.out.println("2. SEK to USD");
        System.out.print("Choose conversion: ");

        int currencyChoice = scanner.nextInt();

        if (currencyChoice == 1) {
            System.out.print("Enter amount in USD: ");
            double usd = scanner.nextDouble();

            double sek = usd * USD_TO_SEK;

            System.out.printf("%.2f USD = %.2f SEK%n", usd, sek);

        } else if (currencyChoice == 2) {
            System.out.print("Enter amount in SEK: ");
            double sek = scanner.nextDouble();

            double usd = sek / USD_TO_SEK;

            System.out.printf("%.2f SEK = %.2f USD%n", sek, usd);

        } else {
            System.out.println("Invalid currency conversion choice.");
        }
    }

    // BMI calculator
    public static void bmiCalculator(Scanner scanner) {
        System.out.println("--- BMI Calculator ---");

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height in meters (e.g. 1.75): ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println("Weight and height must be greater than zero.");
            return;
        }

        double bmi = weight / (height * height);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("BMI category: Underweight");
        } else if (bmi < 25) {
            System.out.println("BMI category: Normal weight");
        } else if (bmi < 30) {
            System.out.println("BMI category: Overweight");
        } else {
            System.out.println("BMI category: Obesity");
        }
    }
}
