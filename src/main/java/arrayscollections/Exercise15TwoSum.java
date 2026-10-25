
package arrayscollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise15TwoSum {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 7, 11, 15, 4, 6);
        int target = 13;

        // Store numbers we have already checked.
        Set<Integer> seen = new HashSet<>();

        boolean pairFound = false;

        for (int number : numbers) {
            int needed = target - number;

            // Check whether the matching number was seen earlier.
            if (seen.contains(needed)) {
                System.out.println("Pair found: " + needed + " + " + number
                        + " = " + target);
                pairFound = true;
                break;
            }

            seen.add(number);
        }

        if (!pairFound) {
            System.out.println("No pair found.");
        }
    }
}
