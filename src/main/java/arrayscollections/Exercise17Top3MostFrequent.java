
package arrayscollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Comparator;

public class Exercise17Top3MostFrequent {

    public static void main(String[] args) {

        List<String> languages = Arrays.asList(
                "java", "python", "java", "c++", "python",
                "java", "ruby", "c++", "python", "ruby", "java"
        );

        // Count how often each language appears.
        Map<String, Integer> frequency = new HashMap<>();

        for (String language : languages) {
            frequency.put(
                    language,
                    frequency.getOrDefault(language, 0) + 1
            );
        }

        // Copy the map entries into a list so they can be sorted.
        List<Map.Entry<String, Integer>> sortedLanguages =
                new ArrayList<>(frequency.entrySet());

        // Sort by frequency, from highest to lowest.
        // If frequencies are equal, sort alphabetically by language.
        sortedLanguages.sort(
                Map.Entry.<String, Integer>comparingByValue(
                        Comparator.reverseOrder()
                ).thenComparing(Map.Entry.comparingByKey())
        );

        System.out.println("Top 3 most frequent languages:");

        int limit = Math.min(3, sortedLanguages.size());

        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = sortedLanguages.get(i);

            System.out.println(
                    (i + 1) + ". " + entry.getKey()
                            + " - " + entry.getValue() + " times"
            );
        }
    }
}
