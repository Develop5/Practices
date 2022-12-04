package com.iterators;

import java.util.*;

public class SetQueueListAndMap {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();
    }

    private static void mapDemo() {
        Map<String, Integer> fruit = new HashMap<String, Integer>();

        fruit.put("apple", 95);
        fruit.put("banana", 30);
        fruit.put("cherry", 20);
        fruit.put("cherry", 3);
        fruit.put("lemon", 15);
        fruit.put("pineapple", 15);

        System.out.println("Map size: " + fruit.size());
        System.out.println("Complete Map fruit without iterating : " + fruit);
        System.out.println("Array of complete Map fruit without iterating : " + fruit.entrySet());

        System.out.println("Remove element by key (lemon)");
        fruit.remove("lemon");
        System.out.println(fruit.entrySet());

        System.out.println("Get element by key (cherry). Take into account it was intended to be repeated");
        fruit.get("cherry");

        System.out.println("------------------------------------------------");

        System.out.println("Printing Map with enhanced loop");
        fruit.forEach((key, value) -> System.out.println("Key : " + key + "  , and Value : " + value));

        System.out.println("Printing Map with long lambda expression");
        fruit.forEach(
                (myKey, myValue) -> System.out.println("Key : " + myKey + "  , and Value : " + myValue)
        );
    }

    private static void queueDemo() {
        Queue<String> fruit = new LinkedList<>();
        fruit.add("peach");
        fruit.add("pineapple");
        fruit.add("lime");
        fruit.add("cherry");
        fruit.add("lime");

        System.out.println("Queue size: " + fruit.size());
        System.out.println("Complete Queue fruit without iterating : " + fruit);
        System.out.println("------------------------------------------------");

        System.out.println("Printing Queue with iterator and While loop");
        Iterator<String> i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Printing Queue with enhanced loop");
        for(String queueElement : fruit) {
            System.out.println(queueElement);
        }

        System.out.println("Printing Queue with long lambda expression");
        fruit.forEach( x -> System.out.println(x));

        System.out.println("Printing Queue with shorten lambda expression");
        fruit.forEach( System.out::println);
    }

    private static void listDemo() {
        List<String> fruit = new ArrayList<>();
        fruit.add("pear");
        fruit.add("strawberry");
        fruit.add("watermelon");
        fruit.add("grape");
        fruit.add("pear");

        System.out.println("List size: " + fruit.size());
        System.out.println("Complete List fruit without iterating : " + fruit);
        System.out.println("------------------------------------------------");

        System.out.println("Printing List with iterator and While loop");
        Iterator<String> i = fruit.iterator();
        while(i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Printing List with enhanced loop");
        for(String eachInList : fruit) {
            System.out.println(eachInList);
        }

        System.out.println("Printing List with long lambda expression");
        fruit.forEach(x -> System.out.println(x));

        System.out.println("Printing List with shorten lambda expression");
        fruit.forEach(System.out::println);
    }


    private static void setDemo() {
        Set<String> fruit = new HashSet<>();
        fruit.add("orange");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("apple");
        fruit.add("lemon");

        System.out.println("Set size: " + fruit.size());
        System.out.println("Complete set fruit without iterating= " + fruit);
        System.out.println("================================================");

        System.out.println("Printing Set with iterator and While loop");
        Iterator<String> i = fruit.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        System.out.println("Printing Set with enhanced loop");
        for(String eachFruit : fruit) {
            System.out.println(eachFruit);
        }

        System.out.println("Printing Set with long lambda expression");
        fruit.forEach(x -> System.out.println(x));

        System.out.println("Printing Set with shorten lambda expression");
        fruit.forEach(System.out::println);
    }
}
