package org.examples.interfaces;

public interface FlightEnable {

    double MILES_TO_KM = 1.6034;            // public static final would be redundant
    double KM_TO_MILES = 0.62371;           // public static final would be redundant

    void takeoff();                 // redundant public and abstract modifiers

    void land();                           // redundant abstract modifier

    void fly();                                     // PREFERRED declaration
}
