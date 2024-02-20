package org.examples.abstractClasses;


import static org.examples.Utilities.printDashes;

public class Main {
    public static void main(String[] args) {

        printDashes();
        // The followin won't compile: we cannot instantiate an abstract class
        // AbstractAnimal animal = new AbstractAnimal("animal", "big", 100);

        DogFromAbstract dog = new DogFromAbstract("Dog", "big", 100);
        dog.makeNoise();

        printDashes();
    }
}
