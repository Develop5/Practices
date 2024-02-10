package org.examples.linkedList1;

import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50) + "\n");

        LinkedList<String> placesToVisit = new LinkedList<>();
        // Type parameter in the decoration
        // Diamond operator in the right side of the assignement

        // We can also declare it by using the var type
        //var placesToVisit = new LinkedList<String>();
        // Here we specify the type on the right side of the assignment
        // But this it optional

        placesToVisit.add("Sidney");
        placesToVisit.add(0, "Canberra");
        System.out.println(placesToVisit);

        addMoreElements(placesToVisit);
        System.out.println(placesToVisit);

        //removeElement(placesToVisit);
        //System.out.println(placesToVisit);

        //gettingElement(placesToVisit);

        //printItinerary3(placesToVisit);

        //testIterator(placesToVisit);

        testListIterator(placesToVisit);

        System.out.println("_".repeat(50));



    }

    public static void addMoreElements(LinkedList<String> list) {
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods
        list.offer("Melbourne");
        // The offer methods does the same as similar to addLast method
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");

        // Stack methods
        list.push("Alice Springs");
    }

    public static void removeElement(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");

        System.out.println(list);
        String s1 = list.remove();          // removes the 1st element and returns the element
        System.out.println(s1 + " was removed from the stack (1st element)");

        String s2 = list.removeFirst();          // removes the 1st element and returns the element
        System.out.println(s2 + " was removed from the stack ");

        String s3 = list.removeLast();          // removes the last element and returns the element
        System.out.println(s3 + " was removed from the stack ");

        // Queue/Dequeue poll methods
        System.out.println("\n" + list);
        String p1 = list.poll();            // Removes 1st element
        System.out.println(p1 + " was removed from the queue");
        String p2 = list.pollFirst();            // Removes 1st element
        System.out.println(p2 + " was removed from the queue");
        String p3 = list.pollFirst();            // Removes 1st element
        System.out.println(p3 + " was removed from the queue");

        list.push("Sidney");
        list.push("Brisbane");
        list.push("Canberra");

        String p4 = list.pop();             // Removes last element from the queue
        System.out.println(p4 + " was removed from the queue");
    }

    public static void gettingElement(LinkedList<String> list) {
        System.out.println("Retrieved element: " + list.get(4));
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Darwin is at a position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at a position: " + list.lastIndexOf("Melbourne"));

        // Queue retrieval method
        System.out.println("Element from element() = " + list.element());   //Queue = FIFO

        // Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());
    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        for (int i = 1; i < list.size() -1 ; i++) {
            System.out.println("--> From " + list.get(i-1) + " to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town: list) {
            // But the first town is repeated
            System.out.println("--> From " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at: " + list.getFirst());
        String previousTown = list.getFirst();

        ListIterator<String> iterator = list.listIterator(1);
        // Passing the index of the first element we want to process, eliminates the first repetition
        while (iterator.hasNext()) {
            String town = iterator.next();
            System.out.println("From " + previousTown + " to " + town);
            previousTown = town;
        }
        System.out.println("Trip ends at " + list.getLast());
    }


    public static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    public static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();
        while (iterator.hasNext()) {
            // System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                //iterator.remove();                          // Produces the same result as iterator
                iterator.add("Lake Wivenhoe");      // Adds this elements immediately following Brisbane
            }
        }

        //while (iterator.hasNext()) {
        //    // This never executes because after running the first loop, the hasNext is false
        //    System.out.println(iterator.next());
        //}
        //System.out.println(list);

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }

}
