package org.examples.interfaces;

public interface FlightEnable {

    void takeoff();                 // redundant public and abstract modifiers

    void land();                           // redundant abstract modifier

    void fly();                                     // PREFERRED declaration
}
