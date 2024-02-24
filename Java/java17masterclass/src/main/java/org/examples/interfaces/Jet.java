package org.examples.interfaces;

public class Jet implements FlightEnabled, Trackable{
    // Methods are copied from Bird.
    // This class can same behaviour as a bird but it is not an animal
    // Therefore, it does not extends the animal class


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
}
