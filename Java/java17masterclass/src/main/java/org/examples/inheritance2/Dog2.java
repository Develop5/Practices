package main.java.org.examples.inheritance2;

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
                // Then, this "toString" calls the method in the parent classç
                // which means that the code does not need to be duplicated
    }

    public void makeNoise() {               // We are overriding the makeNoise parent method
        // Manually created by us
    }

    @Override
    public void move(String speed) {        // Generated with Intellij, from the parent class
        super.move(speed);
        //This calls the superclass method and overrides it,
        //We can now extend the parent method
        //If we do not add anything, it is overridden with an ampty method as the other one above
        //If we add something else below, the parent method is enhanced:
        System.out.println("Dogs run, walk and wag their tail");
        //Now the parent class has an extended functionality created from a child class
        //Then, all objects created now from the parent class will have this functionality created in this subclass.
    }
}

