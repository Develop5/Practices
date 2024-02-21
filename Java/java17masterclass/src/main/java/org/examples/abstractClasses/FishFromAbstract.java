package org.examples.abstractClasses;

public class FishFromAbstract extends AbstractAnimal{
    public FishFromAbstract(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(getExplicitType() + " lazily swimming");
        } else {
            System.out.println(getExplicitType() + " darting frantically");
        }

    }

    @Override
    public void makeNoise() {

        if (typeAbstractAnimal == "Goldfish"){
            System.out.print("swish ");
        } else {
            System.out.print("splash ");
        }

    }
}
