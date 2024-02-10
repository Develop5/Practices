package org.examples.linkedList1;

import java.util.LinkedList;

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

        gettingElement(placesToVisit);

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
        System.out.println("Retrieved Element: " + list.get(4));
    }

    }
