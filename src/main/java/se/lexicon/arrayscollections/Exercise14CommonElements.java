
package se.lexicon.arrayscollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Exercise14CommonElements {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(1, 3, 5, 7, 9, 11);
        List<Integer> list2 = Arrays.asList(3, 6, 9, 12, 15);

        // Store the elements from the first list in a set.
        Set<Integer> commonElements = new HashSet<>(list1);

        // Keep only elements that also exist in the second list.
        commonElements.retainAll(list2);

        System.out.println("Common elements: " + commonElements);
    }
}
