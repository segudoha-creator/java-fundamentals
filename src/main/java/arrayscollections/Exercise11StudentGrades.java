
package arrayscollections;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercise11StudentGrades {

    public static void main(String[] args) {

        // I chose a Map because it connects each student's name
        // to their grade and allows us to look up grades by name.
        // I use a separate sorting step to display students
        // from highest grade to lowest grade.

        Map<String, Integer> grades = new HashMap<>();

        // Add students and their grades
        grades.put("Anna", 85);
        grades.put("Bob", 92);
        grades.put("Alice", 78);
        grades.put("David", 95);
        grades.put("Emma", 88);
        grades.put("Charlie", 72);

        // Copy the map entries into a list so we can sort them
        List<Map.Entry<String, Integer>> sortedGrades =
                new ArrayList<>(grades.entrySet());

        // Sort grades from highest to lowest
        sortedGrades.sort(
                Map.Entry.comparingByValue(Comparator.reverseOrder())
        );

        // Print students in descending grade order
        System.out.println("Students sorted by grade:");

        for (Map.Entry<String, Integer> entry : sortedGrades) {
            System.out.println(
                    entry.getKey() + ": " + entry.getValue()
            );
        }
    }
}
