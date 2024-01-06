package main.java.org.examples.compositionchallenge;

public class SmartKitchen {

    private Refrigerator iceBox;            // According to requiremente
    private CoffeeMaker brewMaster;           // According to requiremente
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }


    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    /*
    public void doSmartKitchenStuff(Refrigerator refrigerator, CoffeeMaker coffeMaker, DishWasher dishWasher){
        addWater(coffeeMaker);
        pourMilk(refrigerator);
        loadDishWasher(dishWasher);
    }

    public void addWater(CoffeeMaker coffeMaker) {
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(Refrigerator refrigerator) {
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher(DishWasher dishWasher) {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean refrigeratorOn, boolean coffeMakerOn, boolean dishWashwerOn) {
        iceBox.setHasWorkToDo(refrigeratorOn);
        brewMaster.setHasWorkToDo(coffeMakerOn);
        dishWasher.setHasWorkToDo(dishWashwerOn);
    }

    public void doKitchenWork(){
        setKitchenState(true, true, true);
    }

     */

    // Course solution
    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishwasherFlag) {
        brewMaster.setHasWorkToDo(coffeeFlag);
        iceBox.setHasWorkToDo(fridgeFlag);
        dishWasher.setHasWorkToDo(dishwasherFlag);
    }

    // Course solution
    public void doKitchenWork(){
        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}
