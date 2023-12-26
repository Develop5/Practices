package main.java.org.examples.inheritance1;

public class Animal {
    private String type;
    private String height;
    private double weight;

    public Animal(String type, String height, double weight) {
        this.type = type;
        this.height = height;
        this.weight = weight;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "tyep='" + type + '\'' +
                ", height='" + height + '\'' +
                ", weight=" + weight +
                '}';
    }

    public void move(String speed) {
        System.out.println(type + " moves " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise");
    }
}
