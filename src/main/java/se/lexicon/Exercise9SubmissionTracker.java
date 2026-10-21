
package se.lexicon;

import java.util.HashSet;

public class Exercise9SubmissionTracker {

    /*
     * I choose HashSet because each student should only be recorded once.
     * HashSet rejects duplicates and lets us check whether a student
     * has already submitted.
     * The order of submissions does not matter in this exercise.
     */

    public static void main(String[] args) {

        HashSet<String> submittedStudents = new HashSet<>();

        String[] submissions = {
                "Anna",
                "Bob",
                "Charlie",
                "David",
                "Anna",
                "Emma",
                "Bob",
                "Frank",
                "Grace",
                "Charlie"
        };

        for (String student : submissions) {

            if (submittedStudents.add(student)) {
                System.out.println(student + " submitted successfully.");
            } else {
                System.out.println("Rejected: " + student
                        + " has already submitted.");
            }
        }

        System.out.println("\nAll submitted students:");
        System.out.println(submittedStudents);
    }
}
