package main.java.org.examples.compositionchallenge;

public class DishWasher {
    private boolean hasWorkToDo;

    public DishWasher(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        doDishes();
    }

    private void doDishes(){
        System.out.println("As a good dishwasher, I am washing dishes");
    }
}
