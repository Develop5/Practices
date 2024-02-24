package org.examples.abstractClassChallenge;



import java.util.ArrayList;

import static org.examples.Utilities.printDashes;

record OrderItem(int quantity, ProductForSale product) {}

public class Store {

    // Any imaginable product for sale

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {

        printDashes();

        storeProducts.add(new Projector("Home projector",
                66.34,
                "Samsung Proj Sunlight"));
        storeProducts.add(new Lavatrice("Industrial Laundry", 500,
                "For professional use only"));
        storeProducts.add(new Lavatrice("Basic LM", 200,
                "Laundry machine with dryer"));
        storeProducts.add(new Projector("PRO projector",
                230.09,
                "Samsung Proj Sunlight, for professional use"));

        listProducts();

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();            // Decoration in the statement
        addAnItemToOrder(order1, 0, 1);
        addAnItemToOrder(order1, 1, 2);
        addAnItemToOrder(order1, 2, 1);
        printOrderItems(order1);

        System.out.println("\nOrder 2");
        var order2 = new ArrayList<OrderItem>();
        addAnItemToOrder(order2, 3, 5);
        addAnItemToOrder(order2, 0, 1);
        addAnItemToOrder(order2, 2, 1);
        printOrderItems(order2);

        printDashes();

    }


    public static void listProducts(){
        for (var item : storeProducts) {
            item.showDetails();
            System.out.println("-".repeat(30));
        }
    }


    public static void addAnItemToOrder(ArrayList<OrderItem> order, int orderIndex,
                                        int qty) {
        order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    }

    public static void printOrderItems(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedLine(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }



}
