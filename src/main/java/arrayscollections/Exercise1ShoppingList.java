
package arrayscollections;

import java.util.ArrayList;

public class Exercise1ShoppingList {

    public static void main(String[] args) {

        // Create an empty shopping list
        ArrayList<String> shoppingList = new ArrayList<>();

        // Add five items
        shoppingList.add("Milk");
        shoppingList.add("Bread");
        shoppingList.add("Eggs");
        shoppingList.add("Apples");
        shoppingList.add("Coffee");

        // Print the original shopping list
        System.out.println("Shopping list:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }

        // Remove one item by name
        System.out.println("\nRemoving Bread...");
        shoppingList.remove("Bread");

        // Print the updated shopping list
        System.out.println("\nUpdated shopping list:");

        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i + 1) + ". " + shoppingList.get(i));
        }
    }
}
