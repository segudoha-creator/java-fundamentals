package se.lexicon;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Exercise8MergeWithoutDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(2);
        listA.add(3);
        listA.add(4);
        listA.add(5);

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(3);
        listB.add(4);
        listB.add(5);
        listB.add(6);
        listB.add(7);

        LinkedHashSet<Integer> mergedList = new LinkedHashSet<>();

        mergedList.addAll(listA);
        mergedList.addAll(listB);

        System.out.println("Merged list without duplicates: " + mergedList);
        System.out.println("Total count: " + mergedList.size());
    }
}