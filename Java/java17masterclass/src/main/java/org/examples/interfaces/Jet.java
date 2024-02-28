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
        System.out.println(getClass().getSimpleName() + " is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " is flying");
    }

    @Override
    public void track() {
        System.out.println(getClass().getSimpleName() + "'s coordinates recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        //return FlightEnabled.super.transition(stage);
        // 'super' here classifies for the interface FlightEnabled
        // This override is not mandatory, but only if you want
        // to implement the default method added to the interface to the subclass
        // We want something different, then the default overriding is not useful
        // We need to write some code

        System.out.println(getClass().getSimpleName() + " transitioning");
        //return FlightStages.CRUISE;
        return FlightEnabled.super.transition(stage);       // qualifies super as the interface type
    }
}
