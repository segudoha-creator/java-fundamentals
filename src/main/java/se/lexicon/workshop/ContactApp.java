
package se.lexicon.workshop;

import java.util.Scanner;

public class ContactApp {

    private static Scanner scanner = new Scanner(System.in);
    private static ContactManager contactManager = new ContactManager();

    public static void main(String[] args) {

        boolean running = true;

        while (running) {
            System.out.println("\n--- CONTACT MANAGEMENT APP ---");
            System.out.println("1. Add contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Search contact");
            System.out.println("4. Update contact");
            System.out.println("5. Delete contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    contactManager.displayAllContacts();
                    break;
                case "3":
                    searchContact();
                    break;
                case "4":
                    updateContact();
                    break;
                case "5":
                    deleteContact();
                    break;
                case "6":
                    running = false;
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addContact() {
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter phone: ");
        String phone = scanner.nextLine().trim();

        System.out.print("Enter email: ");
        String email = scanner.nextLine().trim();

        contactManager.addContact(name, phone, email);
    }

    private static void searchContact() {
        int id = readId();

        if (id == -1) {
            return;
        }

        Contact contact = contactManager.searchContact(id);

        if (contact != null) {
            System.out.println(contact);
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static void updateContact() {
        int id = readId();

        if (id == -1) {
            return;
        }

        Contact contact = contactManager.searchContact(id);

        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
            return;
        }

        System.out.print("Enter new phone: ");
        String phone = scanner.nextLine().trim();

        System.out.print("Enter new email: ");
        String email = scanner.nextLine().trim();

        boolean updated = contactManager.updateContact(
                id, name, phone, email
        );

        if (updated) {
            System.out.println("Contact updated successfully!");
        }
    }

    private static void deleteContact() {
        int id = readId();

        if (id == -1) {
            return;
        }

        boolean deleted = contactManager.deleteContact(id);

        if (deleted) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found.");
        }
    }

    private static int readId() {
        System.out.print("Enter contact ID: ");
        String input = scanner.nextLine().trim();

        try {
            int id = Integer.parseInt(input);

            if (id <= 0) {
                System.out.println("ID must be positive.");
                return -1;
            }

            return id;

        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
            return -1;
        }
    }
}
