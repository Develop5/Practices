package org.examples.abstractClassChallenge;

import java.util.ArrayList;



import static org.examples.Utilities.printDashes;

record OrderItem(int quantity, ArrayList<ProductForSale> itemsToSale){



}
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

        printDashes();

    }


    public static void listProducts(){
        for (var item : storeProducts) {
            System.out.println("-".repeat(30));
            item.showDetails();
        }
    }
    public static void addAnItemToOrder(ProductForSale item) {

    };
    public static void printOrderItems(ArrayList<String> allItems) {
        for (String item : allItems) {
            System.out.println(item);
        }
    printDashes();
    }


    public abstract double getSalesPrice(int quantity);

    public abstract void printPricedLine(int quantity);

}
