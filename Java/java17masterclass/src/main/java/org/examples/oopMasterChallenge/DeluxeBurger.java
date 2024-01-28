package main.java.org.examples.oopMasterChallenge;

public class DeluxeBurger extends Burger{

    Item deluxe1;
    Item deluxe2;


    public DeluxeBurger(String name, double price) {
        super(name, price);
    }

    public void addToppings(String extra1, String extra2, String extra3,
                            String extra4, String extra5) {
        super.addToppings(extra1, extra2, extra3);
        deluxe1 = new Item("TOPPINGS", extra4, 0);
        deluxe2 = new Item("TOPPINGS", extra5, 0);
    }

    @Override
    public void printItemizedList() {
        super.printItemizedList();
        if(deluxe1 != null) {
            deluxe1.printItem();
        }
        if(deluxe2!= null) {
            deluxe2.printItem();
        }
    }

    @Override
    // getExtraPrice needs to be overridden because Deluxe burger is not billed on toppings
    public double getExtraPrice(String toppingName) {
        return 0;
    }
}
