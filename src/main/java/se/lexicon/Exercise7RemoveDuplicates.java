
package se.lexicon;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise7RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(2);
        numbers.add(7);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);
        numbers.add(9);
        numbers.add(3);

        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>(numbers);

        ArrayList<Integer> result = new ArrayList<>(uniqueNumbers);

        System.out.println("Numbers without duplicates: " + result);
    }
}

