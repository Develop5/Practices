package main.java.org.examples.compositionchallenge;

public class Main {
    public static void main(String[] args) {
        Refrigerator theRefrigerator = new Refrigerator(false);
        CoffeMaker theCoffeMaker = new CoffeMaker(false);
        DishWasher theDishWasher = new DishWasher(false);
        SmartKitchen theSmartKitchen = new SmartKitchen(theRefrigerator, theCoffeMaker, theDishWasher);

        theSmartKitchen.doSmartKitchenStuff(theRefrigerator, theCoffeMaker, theDishWasher);

    }
}
