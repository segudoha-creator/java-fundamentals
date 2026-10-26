
package se.lexicon.arrayscollections;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise10ConcertQueue {

    /*
     * I choose Queue because people must be served in FIFO order:
     * First In, First Out.
     * LinkedList implements Queue and allows us to add people
     * at the back and remove people from the front.
     */

    public static void main(String[] args) {

        Queue<String> concertQueue = new LinkedList<>();

        concertQueue.offer("Anna");
        concertQueue.offer("Bob");
        concertQueue.offer("Charlie");
        concertQueue.offer("David");
        concertQueue.offer("Emma");
        concertQueue.offer("Frank");

        System.out.println("Original queue: " + concertQueue);

        System.out.println("\nPeople entering the concert:");

        String firstPerson = concertQueue.poll();
        System.out.println(firstPerson + " entered the concert.");

        String secondPerson = concertQueue.poll();
        System.out.println(secondPerson + " entered the concert.");

        System.out.println("\nRemaining queue: " + concertQueue);
    }
}
