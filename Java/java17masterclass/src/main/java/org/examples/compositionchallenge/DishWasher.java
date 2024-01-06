package main.java.org.examples.compositionchallenge;

public class DishWasher {
    private boolean hasWorkToDo;


    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void doDishes() {
        if (hasWorkToDo) {
            System.out.println("As a good dishwasher, I am washing dishes");
            hasWorkToDo = false;                // Turn off the dishwasher after work
        }
    }
}
