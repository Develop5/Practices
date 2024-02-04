package org.examples.arrayList1;
import java.util.ArrayList;
import java.util.List;
public class MoreList {
    public static void main(String[] args) {
        System.out.println("_".repeat(50));

        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);     //I had to add the import statement manually
        System.out.println(list);
        System.out.println(list.getClass().getSimpleName());
        System.out.println(list.getClass().getName());      // More info than getSimpleName

        System.out.println("\nAdding a new element 'yogurt' to the list .-");
        // Trying to add element to a List, compiles ok, but produces a runtime error
        // because, as seen above, List is immutable
        // list.add("yogurt");

        // Let's use an ArrayList to be able to add elements whenever we want
        ArrayList<String> groceries = new ArrayList<>(list);    // Array from the list
        // Created an ArrayList of strings in the variable grocery
        // and assigned the array list of string to it
        // Created a new instance of ArrayList and added the list to it
        // ArraysLists are mutable
        groceries.add("yogurt");
        System.out.println(groceries);

        System.out.println("\nAdding an ArrayList of strings to groceries .-");
        ArrayList<String> nextList = new ArrayList<>(
                List.of("pickles", "mustard", "cheese")
        );
        groceries.addAll(nextList);
        System.out.println(groceries);




        System.out.println("_".repeat(50));



    }
}
