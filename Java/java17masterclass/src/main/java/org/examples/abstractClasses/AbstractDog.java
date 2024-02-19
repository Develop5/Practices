package org.examples.abstractClasses;

public class AbstractDog extends AbstractAnimal{


    public AbstractDog(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void move(String speed) {

    }

    @Override
    public void makeNoise() {

    }
}
