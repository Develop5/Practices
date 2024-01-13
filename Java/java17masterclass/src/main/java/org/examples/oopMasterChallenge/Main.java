package main.java.org.examples.oopMasterChallenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------------");
        Drink drinkSmallCoke  = new Drink("Coke", "small");
        System.out.printf("The price of %s, size %s: \t$%.2f ",
                drinkSmallCoke.getType(), drinkSmallCoke.getSize(), drinkSmallCoke.getDrinkPrice() );

        System.out.println("\n---------------------------------------");
        Drink drinkBigCoke  = new Drink("7Up", "huge");
        System.out.printf("The price of %s, size %s: \t$%.2f ",
                drinkBigCoke.getType(), drinkBigCoke.getSize(), drinkBigCoke.getDrinkPrice() );

        System.out.println("\n---------------------------------------");
        SideItem sideItem1 = new SideItem("nuggets");
        System.out.printf("The price of side item %s is: \t$%.2f", sideItem1.getType() , sideItem1.getSidePrice());

        System.out.println("\n---------------------------------------");
        Burger burgerChicken = new Burger("Chicken", 5.90);
        System.out.printf("This burger has %d toppings\n", burgerChicken.getToppings());
        System.out.printf("Total price of this %s burger is: \t$%.2f", burgerChicken.getType(), burgerChicken.getPrice());

        System.out.println("\n---------------------------------------");
        burgerChicken.addToppings(2);               // Adding extra toppings
        System.out.printf("This burger has %d toppings\n", burgerChicken.getToppings());
        System.out.printf("Total price of this %s burger is: \t$%.2f", burgerChicken.getType(), burgerChicken.getPrice());

        System.out.println("\n---------------------------------------");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addToppings(7);
        System.out.printf("This burger has %d toppings\n", deluxeBurger.getToppings());
        System.out.printf("Total price of this %s burger is: \t$%.2f", deluxeBurger.getType(), deluxeBurger.getPrice());

        System.out.println("\n---------------------------------------");

    }

    // Crear aquí métodos en el main que impriman las características de los objetos creados

}
