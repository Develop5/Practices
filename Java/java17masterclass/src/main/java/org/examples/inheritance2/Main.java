package main.java.org.examples.inheritance2;

import main.java.org.examples.inheritance2.Animal2;
import main.java.org.examples.inheritance2.Dog2;

public class Main {
    public static void main(String[] args) {
        Animal2 animal = new Animal2("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        // Through constructor A in Dog2
        Dog2 dog = new Dog2();
        doAnimalStuff(dog, "fast");

        // Using constructor B in Dog2 (that calls C in turn)
        Dog2 yorkie = new Dog2("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        // Using constructor C in Dog2
        Dog2 retriever = new Dog2("Labrador Retriever", 65, "Floppy", "Swimmer" );
        doAnimalStuff(retriever, "slow");

    }

    public static void doAnimalStuff(Animal2 animal, String speed) {
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);                 // This does not call the Animal's toString() method
                                                    // instead, it calls the Dog's toString() method
        // Java sees a call to Animal, but it discovers that Dog is a more specific object
        System.out.println("_ _ _ _");
    }


}

