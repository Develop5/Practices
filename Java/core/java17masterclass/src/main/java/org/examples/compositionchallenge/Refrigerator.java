package org.examples.compositionchallenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void orderFood() {
        if (hasWorkToDo) {
            System.out.println("As a good refrigerator, I have ordered food");
            hasWorkToDo = false;                // Turn off the refrigerator after work
        }
    }
}
