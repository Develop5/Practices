package main.java.org.examples.compositionchallenge;

public class CoffeMaker {
    private boolean hasWorkToDo;

    public CoffeMaker(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
        brewCoffe();
    }

    private void brewCoffe(){
        System.out.println("As a good coffe maker, I am brewing coffe");
    }
}
