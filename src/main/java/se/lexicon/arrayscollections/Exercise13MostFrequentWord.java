
package se.lexicon.arrayscollections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise13MostFrequentWord {

    public static void main(String[] args) {

        List<String> words = Arrays.asList(
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        );

        // Count how many times each word appears.
        Map<String, Integer> wordCounts = new HashMap<>();

        for (String word : words) {
            wordCounts.put(
                    word,
                    wordCounts.getOrDefault(word, 0) + 1
            );
        }

        // Find the word with the highest frequency.
        String mostFrequentWord = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequentWord = entry.getKey();
                highestCount = entry.getValue();
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Count: " + highestCount);
    }
}
