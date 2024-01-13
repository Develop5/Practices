package main.java.org.examples.oopMasterChallenge;

public class Burger {
    private String type;

    protected double price;
    private int toppings = 3;

    public Burger(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getToppings() {
        return toppings;
    }

    public void addToppings(int extraToppings) {
        // Price does not change if number of toppings does not overcome 3
        // But when it is over 3, the price increases accordingly
        int tempToppings = toppings + extraToppings;
        if (tempToppings > 3) {
            System.out.printf("------ price with normal 3 toppings: %.2f\n", price);
            price += extraToppings * 1.1;
            System.out.printf("------ %d extra toppings added rise in $%.2f\n", extraToppings, (extraToppings * 1.1));
        }
        toppings = tempToppings;
    }
}
