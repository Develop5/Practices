package org.examples.abstractClassChallenge;


import java.sql.ClientInfoStatus;
import java.util.ArrayList;

import static org.examples.Utilities.printDashes;
public abstract class Store {
    // Any imaginable product for sale
    public static void main(String[] args) {
        printDashes();

        ArrayList<String> productsForSale = new ArrayList<>();
        ArrayList<String> listOfOrderItems = new ArrayList<>();

    }

    public void addAnItemToOrder(ArrayList<String> list, String itemName) {
        list.add(itemName);
    };
    public void printOrderItems(ArrayList<String> allItems) {
        for (String item : allItems) {
            System.out.println(item);
        }
    printDashes();
    }


    public abstract double getSalesPrice(int quantity);

    public abstract void printPricedLine(int quantity);

}
