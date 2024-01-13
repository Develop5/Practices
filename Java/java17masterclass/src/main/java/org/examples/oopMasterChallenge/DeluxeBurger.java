package main.java.org.examples.oopMasterChallenge;

public class DeluxeBurger extends Burger{
    public DeluxeBurger() {
        super("Deluxe Burger", 12.90);
    }

    @Override
    public void addToppings(int numberExtraToppings) {
        super.addToppings(numberExtraToppings);
        price = 7.90;
    }
}
