package org.examples.interfaces;

public interface FlightEnable {

    protected abstract void takeoff();                 // redundant public and abstract modifiers

    abstract void land();                           // redundant abstract modifier

    void fly();                                     // PREFERRED declaration
}
