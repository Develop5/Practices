package main.java.org.examples.compositionchallenge;

public class Refrigerator {
    private boolean hasWorkToDo;

    public Refrigerator(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        orderFood();
    }

    private void orderFood(){
        System.out.println("As a good refrigerator, I have ordered food");
    }
}
