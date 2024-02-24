package org.examples.abstractClassChallenge;

import java.util.ArrayList;

import static org.examples.Utilities.printDashes;

record OrderItem(int quantity, ProductForSale product){}
public abstract class Store {

    // Any imaginable product for sale

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();

    public static void main(String[] args) {
        printDashes();
        storeProducts.add(new Projector("Home projector",
                66.34,
                "Samsung Proj Sunlight"));
        storeProducts.add(new Projector("PRO projector",
                230.09,
                "Samsung Proj Sunlight, for professional use"));


        ArrayList<String> listOfOrderItems = new ArrayList<>();
        Lavatrice lavatrice1 = new Lavatrice(234.70, "Model Braun 2Xa6");
        Lavatrice lavatrice2 = new Lavatrice(400, "Sawyer 145");

        listProducts();

        System.out.println("\nOrder 1");
        ArrayList<OrderItem> order1 = new ArrayList<>();            // Decoration in the statement
        //addAnItemToOrder(order1, 1, 2);
        addAnItemToOrder(order1, 0, 1);
        printOrderItems(order1);

        printDashes();

    }


    public static void listProducts(){
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addAnItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        //order.add(new OrderItem(qty, storeProducts.get(orderIndex)));
    };

    public static void printOrderItems(ArrayList<OrderItem> order) {
        double salesTotal = 0;
        for (var item : order) {
            item.product().printPricedLine(item.quantity());
            salesTotal += item.product().getSalesPrice(item.quantity());
        }
        System.out.printf("Sales total = $%6.2f %n", salesTotal);
    }


    public abstract double getSalesPrice(int quantity);

    public abstract void printPricedLine(int quantity);

}
