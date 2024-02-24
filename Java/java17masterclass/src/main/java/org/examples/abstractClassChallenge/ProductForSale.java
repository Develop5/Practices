package org.examples.abstractClassChallenge;

public abstract class ProductForSale extends Store{

    // protected, because the subclasses will need to access and modify them
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    @Override
    public double getSalesPrice(int quantity) {
        return (quantity * price);
    }

    @Override
    public void printPricedLine(int quantity) {
        System.out.printf("Product: %s Description: %s Price: %6.2f " +
                this.type + this.description + getSalesPrice(quantity));

        System.out.printf("%2d qty at $%8.2f each, %-15s %-35s %n",
                quantity, price, type, description);

    }

    public abstract void showDetails();
}
