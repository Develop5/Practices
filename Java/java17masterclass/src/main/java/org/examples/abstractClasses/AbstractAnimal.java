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

    // The following cannot be done, as subclasses would not be able to use it,
    // which is the goal in abstraction:
    // private abstract void move(String speed);

    public abstract void makeNoise();

    public final String getExplicitType() {
        // Once it is declared final, the method cannot be overridden
        // Then, abstract classes can contain abstract and concrete method
        // and concrete methods can be designed so that the subclass cannot change them
        return getClass().getSimpleName() + " (" + typeAbstractAnimal + ")  ";
    }
}
