package main.java.firsttopics.animalspolymorphism.abstraction;

public abstract class Animals {
    public abstract void makeSound();                       // Abstract method. It must be implemented in subclass
    public void eat(String specificFood) {
        System.out.println("I eat : " + specificFood);      // Npm-abstract method. It might not be implemented in subclass
    }
}
