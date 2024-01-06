package main.java.org.examples.compositionchallenge;

public class Main {
    public static void main(String[] args) {

        SmartKitchen theSmartKitchen = new SmartKitchen();

        /*
        // Initializing instance variable
        // Using passing objects
        theSmartKitchen.getDishWasher().setHasWorkToDo(true);
        theSmartKitchen.getIceBox().setHasWorkToDo(false);
        theSmartKitchen.getBrewMaster().setHasWorkToDo(true);

        theSmartKitchen.getDishWasher().doDishes();
        theSmartKitchen.getIceBox().orderFood();
        theSmartKitchen.getBrewMaster().brewCoffee();
         */


        theSmartKitchen.setKitchenState(false, false, true);
        theSmartKitchen.doKitchenWork();
    }
}
