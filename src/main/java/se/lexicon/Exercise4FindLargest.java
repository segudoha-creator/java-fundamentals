package se.lexicon;

import java.util.ArrayList;

public class Exercise4FindLargest {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(14);
        numbers.add(3);
        numbers.add(78);
        numbers.add(45);
        numbers.add(22);
        numbers.add(91);
        numbers.add(7);
        numbers.add(56);

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("The largest number is: " + largest);
    }
}