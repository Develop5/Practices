package org.examples.arrayList1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
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

        System.out.println("\nGetting elements from ArrayList .-");
        System.out.println("Third element is: " + groceries.get(2));
        if (groceries.contains("mustard")) {
            System.out.println("Mustard is in the grocery list");
        }

        System.out.println("\nAdding a second 'yogurt' to the list .-");
        groceries.add("yogurt");            // Now we have 2 members with the same value
        System.out.println("first yogurt: " + groceries.indexOf("yogurt"));
        System.out.println("last yogurt: " + groceries.lastIndexOf("yogurt"));

        System.out.println("\nRemove by index and by value .-");
        System.out.println("Initial list: \t" + groceries);
        groceries.remove(1);                // Removes the second element
        System.out.println("Second element removed: \t" + groceries);
        groceries.remove("yogurt");             // Only the first one
        System.out.println("Yogurt removed (1st found): \t" + groceries);
        // All 'yogurt' strings can be removed by using the following:
        //groceries.removeAll(List.of("yogurt"));
        //System.out.println("All yogurts removed: \t" + groceries);

        System.out.println("\nA group of elements can be removed at once .-");
        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println("'apples' and 'eggs' removed : \t" + groceries);

        System.out.printf("\nDeleting all but excepted .-");
        groceries.retainAll(List.of("apples", "milk", "mustard", "cheese"));
        //'apples' will be ignored as it was removed in the block above
        System.out.println("Remaining list: \t" + groceries);

        System.out.println("\nCleaning up the whole list .-");
        groceries.clear();
        System.out.println("is empty: \t" + groceries.isEmpty());

        System.out.println("\nAdding a list .-");
        groceries.addAll(List.of("apples", "milk", "mustard"));
        System.out.println("After adding a list: \t" + groceries);

        System.out.println("\nAdding an ArrayList .-");
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));
        System.out.println("After adding an ArrayList: \t" + groceries);

        System.out.println("\nSorting out the ArrayList .-");
        groceries.sort(Comparator.naturalOrder());
        System.out.println("After sorting naturally: \t" + groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println("After sorting in reverse order: \t" + groceries);

        System.out.println("\nJava17. Using var to pass an array.-");
        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println("var ---> groceryArray: \t" + Arrays.toString(groceryArray));

        System.out.println("_".repeat(50));

    }
}
