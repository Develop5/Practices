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
    }
}
