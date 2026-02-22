package org.examples.polymorphismChallenge;

public class Car {
    public String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("Car -> Start Engine");
    }

    public void drive() {
        System.out.println("Car -> Driving, type is " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Run Engine");
    }
}
