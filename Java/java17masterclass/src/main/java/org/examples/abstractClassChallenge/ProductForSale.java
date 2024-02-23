package org.examples.abstractClassChallenge;

public class ProductForSale extends Store{
    String type;
    double price;
    String description;

    @Override
    public double getSalesPrice(int quantity) {
        return (quantity * this.price);
    }

    @Override
    public void printPricedLine(int quantity) {
        System.out.printf("Product: %s Description: %s Price: %6.2f " +
                this.type + this.description + getSalesPrice(quantity));

    }
}
