package org.examples.abstractClasses;

public class DogFromAbstract extends AbstractAnimal{
    public DogFromAbstract(String typeAbstractAnimal, String size, double weight) {
        super(typeAbstractAnimal, size, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")) {
            System.out.println(getExplicitType() + " walking");
        } else {
            System.out.println(getExplicitType() + " running");
        }

    }

    @Override
    public void makeNoise() {
        if (typeAbstractAnimal == "Wolf"){
            System.out.print("Howling! ");
        } else {
            System.out.print("Woolf! ");
        }
    }

    // The following does not compile once the parent method is final
    //@Override
    //public String getExplicitType(){
    //
    //}


}
