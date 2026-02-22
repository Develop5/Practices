package main.java.firsttopics.animalspolymorphism.abstraction;

public class Pig extends Animals{
    private String pigFood;

    @Override
    public void makeSound() {
        System.out.println("I make a pig sound");
    }

    @Override
    public void eat(String pigFood) {
        System.out.println("I eat like a pig: " + pigFood);
    }
}
