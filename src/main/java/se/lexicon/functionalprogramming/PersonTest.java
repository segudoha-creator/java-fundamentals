
package se.lexicon.functionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    public static void main(String[] args) {

        Person amina = new Person("Amina", 22, "Stockholm", true);
        Person erik = new Person("Erik", 17, "Uppsala", true);
        Person noah = new Person("Noah", 34, "Stockholm", false);
        Person sara = new Person("Sara", 29, "Gothenburg", true);
        Person lina = new Person("Lina", 41, "Malmö", false);
        Person omar = new Person("Omar", 19, "Stockholm", true);

        ArrayList<Person> people = new ArrayList<>();
        people.add(amina);
        people.add(erik);
        people.add(noah);
        people.add(sara);
        people.add(lina);
        people.add(omar);

        System.out.println("All people:");
        System.out.println(people);

        // Part 1: Functional Programming

        PersonRule activeRule = person -> person.isActive();
        System.out.println(activeRule.test(amina));
        System.out.println(activeRule.test(noah));

        PersonRule adultRule = person -> person.getAge() >= 18;
        System.out.println(adultRule.test(erik));
        System.out.println(adultRule.test(amina));

        PersonRule stockholmRule =
                person -> person.getCity().equals("Stockholm");
        System.out.println(stockholmRule.test(amina));
        System.out.println(stockholmRule.test(erik));

        PersonRule activeAndAdult = person ->
                activeRule.test(person) && adultRule.test(person);

        System.out.println(activeAndAdult.test(amina));
        System.out.println(activeAndAdult.test(erik));

        ArrayList<Person> activePeople =
                PersonFilter.filterPeople(people, activeRule);

        System.out.println("Active people:");
        System.out.println(activePeople);

        PersonAction printName =
                person -> System.out.println(person.getName());
        printName.execute(amina);

        PersonAction sendEmail =
                person -> System.out.println("Send email to " + person.getName());
        sendEmail.execute(amina);

        // Part 2: Stream API

        // 1. Filter active people
        List<Person> activePeopleStream = people.stream()
                .filter(person -> person.isActive())
                .toList();

        System.out.println("Active people using Streams:");
        System.out.println(activePeopleStream);

        // 2. Get all people's names
        List<String> names = people.stream()
                .map(person -> person.getName())
                .toList();

        System.out.println("All people's names:");
        System.out.println(names);
        // 3. Count adults
        long adultCount = people.stream()
                .filter(person -> person.getAge() >= 18)
                .count();

        System.out.println("Number of adults:");
        System.out.println(adultCount);
        // 4. Sort people by age
        List<Person> sortedByAge = people.stream()
                .sorted((person1, person2) ->
                        Integer.compare(person1.getAge(), person2.getAge()))
                .toList();

        System.out.println("People sorted by age:");
        System.out.println(sortedByAge);
        // 5. Find the first active person in Stockholm
        Person firstActiveStockholm = people.stream()
                .filter(person -> person.isActive())
                .filter(person -> person.getCity().equals("Stockholm"))
                .findFirst()
                .orElse(null);

        System.out.println("First active person in Stockholm:");
        System.out.println(firstActiveStockholm);
    }
}
