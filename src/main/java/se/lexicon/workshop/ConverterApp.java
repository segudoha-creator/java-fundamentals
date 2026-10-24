package se.lexicon.workshop;

import java.util.Scanner;

public class ConverterApp {

    // Fixed conversion values for the workshop
    public static final double SEK_TO_USD_RATE = 10.87;
    public static final double SEK_TO_EUR_RATE = 11.32;
    public static final double FAHRENHEIT_OFFSET = 32.0;
    public static final double CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    public static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;

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

            if (choice != 4) {
                String answer;

                do {
                    System.out.print("Continue? (yes/no): ");
                    answer = scanner.next();

                    if (!answer.equalsIgnoreCase("yes")
                            && !answer.equalsIgnoreCase("no")) {
                        System.out.println("Please enter yes or no.");
                    }

                } while (!answer.equalsIgnoreCase("yes")
                        && !answer.equalsIgnoreCase("no"));

                if (answer.equalsIgnoreCase("no")) {
                    choice = 4;
                    System.out.println("Goodbye!");
                }
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
        System.out.print("Your choice: ");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();

            double fahrenheit = celsiusToFahrenheit(celsius);

            System.out.printf("Result: %.2f C = %.2f F%n",
                    celsius, fahrenheit);

        } else if (option == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            double celsius = fahrenheitToCelsius(fahrenheit);

            System.out.printf("Result: %.2f F = %.2f C%n",
                    fahrenheit, celsius);

        } else {
            System.out.println("Invalid temperature conversion choice.");
        }
    }

    // Convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return celsius * CELSIUS_TO_FAHRENHEIT + FAHRENHEIT_OFFSET;
    }

    // Convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_OFFSET)
                * FAHRENHEIT_TO_CELSIUS;
    }

    // Currency converter
    public static void currencyConverter(Scanner scanner) {
        System.out.println("--- Currency Converter ---");
        System.out.println("1. SEK to USD");
        System.out.println("2. SEK to EUR");
        System.out.print("Your choice: ");

        int option = scanner.nextInt();

        if (option == 1) {
            System.out.print("Enter amount in SEK: ");
            double sek = scanner.nextDouble();

            double usd = sekToUsd(sek);

            System.out.printf("Result: %.2f SEK = %.2f USD%n",
                    sek, usd);

        } else if (option == 2) {
            System.out.print("Enter amount in SEK: ");
            double sek = scanner.nextDouble();

            double eur = sekToEur(sek);

            System.out.printf("Result: %.2f SEK = %.2f EUR%n",
                    sek, eur);

        } else {
            System.out.println("Invalid currency conversion choice.");
        }
    }

    // Convert SEK to USD
    public static double sekToUsd(double sek) {
        return sek / SEK_TO_USD_RATE;
    }

    // Convert SEK to EUR
    public static double sekToEur(double sek) {
        return sek / SEK_TO_EUR_RATE;
    }

    // BMI calculator
    public static void bmiCalculator(Scanner scanner) {
        System.out.println("--- BMI Calculator ---");

        System.out.print("Enter weight in kg: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter height in metres: ");
        double height = scanner.nextDouble();

        if (weight <= 0 || height <= 0) {
            System.out.println(
                    "Weight and height must be greater than zero.");
            return;
        }

        double bmi = calculateBmi(weight, height);

        System.out.printf("BMI: %.2f  ->  ", bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    // Calculate BMI
    public static double calculateBmi(double weight, double height) {
        return weight / Math.pow(height, 2);
    }
}