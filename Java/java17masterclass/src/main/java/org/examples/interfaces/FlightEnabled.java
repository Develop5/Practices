package org.examples.interfaces;

public interface FlightEnabled {

    double MILES_TO_KM = 1.6034;            // public static final would be redundant
    double KM_TO_MILES = 0.62371;           // public static final would be redundant

    void takeoff();                 // redundant public and abstract modifiers

    void land();                           // redundant abstract modifier

    void fly();                                     // PREFERRED declaration

    // A new method is needed for FlightEnabled ojbect, call transition,
    // which eases the stages to be setup
    //FlightStages transition(FlightStages stage);    // Bird, DragonFly, Jet have to change
    default FlightStages transition(FlightStages stage) {       // Not affecting subclasses
        System.out.println("Transition not implemented on " +
                getClass().getName());
        return null;
    }


}
