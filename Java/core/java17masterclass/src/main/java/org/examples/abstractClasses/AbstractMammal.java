package org.examples.abstractClasses;

abstract class AbstractMammal extends AbstractAnimal{
    public AbstractMammal(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void move(String speed) {
        System.out.print(getExplicitType() + " ");
        System.out.println(speed.equals("slow") ? "walks" : "runs");
    }

    public abstract void shedHair();


}
