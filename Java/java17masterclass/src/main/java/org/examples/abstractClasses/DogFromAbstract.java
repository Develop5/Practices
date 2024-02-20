package org.examples.abstractClasses;

public class DogFromAbstract extends AbstractAnimal{

    public DogFromAbstract(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

        if (typeAbstractAnimal == "Wolf"){
            System.out.println("Howling! ");
        } else {
            System.out.println("Woolf! ");
        }

    }
}
