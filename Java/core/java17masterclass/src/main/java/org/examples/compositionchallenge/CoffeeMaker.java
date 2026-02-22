package org.examples.compositionchallenge;

public class CoffeeMaker {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void brewCoffee() {
        if (hasWorkToDo) {
            System.out.println("As a good coffeemaker, I am brewing coffee");
            hasWorkToDo = false;            // Turn off the coffeemaker after work
        }
    }
}
