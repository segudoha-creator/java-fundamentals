
package arrayscollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise16SecondLargest {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(
                34, 78, 23, 78, 91, 56, 91, 12
        );

        // Use a Set to remove duplicate numbers.
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find the largest and second-largest unique numbers
        // without sorting the collection.
        for (int number : uniqueNumbers) {

            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number < largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second-largest unique number.");
        } else {
            System.out.println("Second-largest unique number: " + secondLargest);
        }
    }
}
