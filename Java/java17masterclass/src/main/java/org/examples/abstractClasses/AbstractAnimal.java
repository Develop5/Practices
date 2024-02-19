package org.examples.abstractClasses;

public abstract class AbstractAnimal {
    protected String typeAbstractAnimal;            // Not to confuse with any other in the package
    private String size;                    // Won't be used by subclasses
    private double weight;                  // Won't be used by subclasses

    public AbstractAnimal(String typeAbstractAnimal, String size, double weight) {
        this.typeAbstractAnimal = typeAbstractAnimal;
        this.size = size;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();
}
