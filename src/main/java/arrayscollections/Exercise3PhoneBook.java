
package arrayscollections;

import java.util.HashMap;
import java.util.Scanner;

public class Exercise3PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Anna", "0701234567");
        phoneBook.put("Bob", "0702345678");
        phoneBook.put("Charlie", "0703456789");
        phoneBook.put("David", "0704567890");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name to search: ");
        String name = scanner.nextLine();

        String phoneNumber = phoneBook.get(name);

        if (phoneNumber != null) {
            System.out.println("Phone number: " + phoneNumber);
        } else {
            System.out.println("Contact not found.");
        }

        scanner.close();
    }
}
