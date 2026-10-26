
package se.lexicon.arrayscollections;

import java.util.HashSet;
import java.util.Set;

public class Exercise2UniqueCities {

    public static void main(String[] args) {

        Set<String> cities = new HashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        System.out.println("Unique cities:");

        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("Total unique cities: " + cities.size());
    }
}
