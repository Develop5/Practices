package main.java.org.examples.polymorphismExercise;

public class Ford extends Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }


    public String startEngine() {
        return super.startEngine();
    }

    @Override
    public String accelerate() {
        return super.accelerate();
    }

    @Override
    public String brake() {
        return super.brake();
    }
}
