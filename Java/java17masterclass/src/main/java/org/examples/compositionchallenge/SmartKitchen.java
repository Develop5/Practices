package main.java.org.examples.compositionchallenge;

public class SmartKitchen {

    private Refrigerator refrigerator;
    private CoffeMaker coffeMaker;
    private DishWasher dishWasher;

    public SmartKitchen(Refrigerator refrigerator, CoffeMaker coffeMaker, DishWasher dishWasher) {
        this.refrigerator = refrigerator;
        this.coffeMaker = coffeMaker;
        this.dishWasher = dishWasher;
    }

    public void doSmartKitchenStuff(Refrigerator refrigerator, CoffeMaker coffeMaker, DishWasher dishWasher){
        addWater(coffeMaker);
        pourMilk(refrigerator);
        loadDishWasher(dishWasher);
    }

    public void addWater(CoffeMaker coffeMaker) {
        coffeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(Refrigerator refrigerator) {
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher(DishWasher dishWasher) {
        dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean refrigeratorOn, boolean coffeMakerOn, boolean dishWashwerOn) {
        refrigerator.setHasWorkToDo(refrigeratorOn);
        coffeMaker.setHasWorkToDo(coffeMakerOn);
        dishWasher.setHasWorkToDo(dishWashwerOn);
    }

    public void doKitchenWork(){
        setKitchenState(true, true, true);
    }

}
