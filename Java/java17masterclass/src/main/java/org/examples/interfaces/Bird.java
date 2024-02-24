package org.examples.interfaces;

public class Bird extends AbstractAnimal3 implements FlightEnable, Trackable{
    @Override
    public void move() {
        System.out.println("Flags wings");
    }

    @Override
    public void takeoff() {
        System.out.println(getClass().getSimpleName() + " is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName() + " is lsnding");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }
    // Here we describe a Bird for what it is and what it does
}
