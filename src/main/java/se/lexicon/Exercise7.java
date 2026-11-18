
package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class Exercise7 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        try {

            addName(names, "Anna");
            addName(names, "Erik");
            addName(names, "Sara");

            addName(names, "Anna");

        } catch (DuplicateNameException e) {

            System.out.println("Error: " + e.getMessage());
        }

        try {

            searchName(names, "Erik");
            searchName(names, "Lisa");

        } catch (NameNotFoundException e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Names in the list: " + names);
    }

    public static void addName(List<String> names, String name)
            throws DuplicateNameException {

        if (names.contains(name)) {

            throw new DuplicateNameException(
                    "The name already exists: " + name
            );
        }

        names.add(name);
        System.out.println(name + " was added successfully.");
    }

    public static void searchName(List<String> names, String name)
            throws NameNotFoundException {

        if (!names.contains(name)) {

            throw new NameNotFoundException(
                    "The name was not found: " + name
            );
        }

        System.out.println(name + " was found in the list.");
    }
}
