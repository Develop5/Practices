package org.examples.interfaces;

public class Bird extends AbstractAnimal3 implements FlightEnable, Trackable{
    @Override
    public void move() {
        System.out.println("Flags wings");
    }
    // Here we describe a Bird for what it is and what it does
}
