package org.examples.abstractClasses;


import java.util.ArrayList;

import static org.examples.Utilities.printDashes;

public class Main {
    public static void main(String[] args) {

        // We never use the class Animal in this package, as it can be linked to
        // a different public class in the whole package.
        // Instead, we use AbstractAnimal.
        // Similarly, classes extended from that are suffixed with ...fromAbstractAnimal.
        // This way, access modifiers can be used as in the examples.

        printDashes();

        // The followin won't compile: we cannot instantiate an abstract class
        // AbstractAnimal animal = new AbstractAnimal("animal", "big", 100);

        DogFromAbstract dog = new DogFromAbstract("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<AbstractAnimal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new DogFromAbstract("German Shepard", "big", 150));
        animals.add(new FishFromAbstract("Goldfish", "small", 1));
        animals.add(new FishFromAbstract("Barracuda", "big", 75));
        animals.add(new DogFromAbstract("Pug", "small", 20));

        animals.add(new Horse("Clydesdale", "large", 1000));

        for (AbstractAnimal animal : animals) {
            doAnimalStuff(animal);
            if (animal instanceof AbstractMammal currentMammal) {
                currentMammal.shedHair();
            }
        }

        printDashes();
    }

    private static void doAnimalStuff(AbstractAnimal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
