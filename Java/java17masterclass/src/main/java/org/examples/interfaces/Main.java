package org.examples.interfaces;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird();
        AbstractAnimal3 animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

        animal.move();
        flier.move();                   // Does not compile
        tracked.move();                 // Does not compile


    }
}
