package org.examples.arrayList1;

import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("_".repeat(50));

        /*
        Object[] groceryArray = new Object[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = "5 oranges";
        System.out.println(Arrays.toString(groceryArray));
         */

        // Let's do the same by using a GroceryItem array.
        // The third element needs to be declared differently.
        System.out.println("\nGroceryItem array .-");
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        // This cannot be used:
        //groceryArray[2] = "5 oranges";
        // because a top checking at compile time. It produces an error
        // But this, instead:
        groceryArray[2] = new GroceryItem("oranges", "PRODUCE", 6);
        System.out.println(Arrays.toString(groceryArray));

        /*This uses an unchecked or unsafe operation ArrayList without specifying type
        System.out.println("\nArray list .-");
        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("butter"));
        objectList.add("Yogurt");           // Adding just a string. Not an expected item
        System.out.println(objectList);
         */

        System.out.println("\nSpecifying what kind of list you want .-");
        //ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        // Intellij says the second referenc to GroceryItem on the right
        // (explicit top argument), is unnecessary. It takes us to eliminate it:
        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("butter"));
        System.out.println(groceryList);

        // The top checking will not allow this inconsistency in the list
        //groceryList.add("Yogurt");

        System.out.println("_".repeat(50));

    }
}
