
package se.lexicon.arrayscollections;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class Exercise12GroupByFirstLetter {

    public static void main(String[] args) {

        List<String> names = Arrays.asList(
                "Alice", "Bob", "Anna", "Charlie",
                "Brian", "Amanda", "Carl"
        );

        // TreeMap groups names by first letter and keeps the letters sorted.
        Map<Character, List<String>> groupedNames = new TreeMap<>();

        for (String name : names) {
            char firstLetter = Character.toUpperCase(name.charAt(0));

            groupedNames.putIfAbsent(firstLetter, new ArrayList<>());

            groupedNames.get(firstLetter).add(name);
        }

        System.out.println("Names grouped by first letter:");

        for (Map.Entry<Character, List<String>> entry : groupedNames.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
