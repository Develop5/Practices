package org.examples.inheritance2;

public class Dog2 extends Animal2{
    private String earShape;
    private String tailShape;
    public Dog2() {
        // Let's call this constructor A
        super("Mutt", "Big", 50);       // Calling constructor with no params, produces null
    }


    public Dog2(String type, double weight) {           //
        // Let's call this constructor B
        this(type, weight, "Perky", "Curl");
        // This chaining constructor calls the other constructor with 4 parameters
        // And makes the creation of objects for dogs with Perky and Curl features easier.
    }

    //This is the original constructor auto-generated from the super class:
    //public Dog2(String type, String height, double weight, String earShape, String tailShape) {
    // But I am going to use the followingg, replacing the size by an evaluation.
    public Dog2(String type, double weight, String earShape, String tailShape) {
        // Let's call this constructor C
        super(type, weight < 15 ? "small" :  (weight < 35 ? "medium" : "large") , weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog2{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();                    // This one calls toString in super "Animal2{...}"
                // Then, this "toString" calls the method in the parent class
                // which means that the code does not need to be duplicated
    }

    public void makeNoise() {               // We are overriding the makeNoise parent method
        // Manually created by us
        // By now, this override the parent subclass, but does nothing

        // Now, we will enhance the parent class by calling a bark method in Dog2 subclass
        if(type == "Wolf") {        // But type is private. Needs to be changed to protected
            System.out.println("Ow Woooooo! ");
        }
        bark();
        System.out.println();

    }

    @Override
    public void move(String speed) {        // Generated with Intellij, from the parent class
        super.move(speed);                  // Calls the move method in the parent class Animal
        //This calls the superclass method AND overrides it,
        //We can now extend the parent method
        //If we do not add anything, it is overridden with an empty method same as the other one above
        //If we add something else below, the parent method is enhanced:
        /*
        System.out.println("Dogs run, walk and wag their tail");

         */
        //Now the parent class has an extended functionality created from a child class
        //Then, all objects created now from the parent class will have this functionality created in this subclass.

        if (speed == "slow"){
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();       // Apart from calling the other methods we do nothing
    }

    private void bark(){
        System.out.println("Wolf! ");
    }
    private void run(){
        System.out.println("Dog Running ");
    }
    private void walk(){
        System.out.println("Dog Walking ");
    }
    private void wagTail(){
        System.out.println("Tail Wagging ");
    }


}

