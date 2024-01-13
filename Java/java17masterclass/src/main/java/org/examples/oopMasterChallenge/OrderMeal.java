package main.java.org.examples.oopMasterChallenge;

public class OrderMeal {
    private String typeOfBurger;
    private String typeOfDrink;
    private String typeOfSideItem;


    public OrderMeal() {
        this.typeOfBurger = "Regular burger";
        this.typeOfDrink = "Small Coke";
        this.typeOfSideItem = "Fries";
    }

    public OrderMeal(String typeOfBurger, String typeOfDrink, String typeOfSideItem) {
        this.typeOfBurger = typeOfBurger;
        this.typeOfDrink = typeOfDrink;
        this.typeOfSideItem = typeOfSideItem;
    }




}
