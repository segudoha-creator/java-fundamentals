
package se.lexicon.arrayscollections;

import java.util.ArrayList;
import java.util.TreeMap;

public class Exercise6WordFrequency {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("apple");
        words.add("banana");
        words.add("apple");
        words.add("orange");
        words.add("banana");
        words.add("apple");
        words.add("grape");
        words.add("orange");

        TreeMap<String, Integer> wordCounts = new TreeMap<>();

        for (String word : words) {
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }
}
