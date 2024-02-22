package org.examples.abstractClasses;

public class Horse extends AbstractMammal{
    public Horse(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void makeNoise() {

    }

    @Override
    public void shedHair() {
        System.out.println(getExplicitType() + " sheds in the spring");

    }
}
