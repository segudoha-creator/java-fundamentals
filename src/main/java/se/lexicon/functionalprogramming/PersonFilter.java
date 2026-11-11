
package se.lexicon.functionalprogramming;

import java.util.ArrayList;

public class PersonFilter {

    public static ArrayList<Person> filterPeople(ArrayList<Person> people, PersonRule rule) {

        ArrayList<Person> result = new ArrayList<>();

        for (Person person : people) {
            if (rule.test(person)) {
                result.add(person);
            }
        }

        return result;
    }
}
