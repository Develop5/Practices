package main.java.org.examples.inheritance2;

public class Animal2 {
    private String type;
    private String size;
    private double weight;

    public Animal2(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public Animal2() {
    }

    @Override
    public String toString() {
        return "Animal2{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
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
