package org.examples.abstractClassChallenge;

public class Projector extends ProductForSale{


    public Projector(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void showDetails() {
        System.out.println("This " + type + " is a high resolution projector");
        System.out.printf("The price of the device is %6.2f %n", price);
        System.out.println(description);

    }
}
