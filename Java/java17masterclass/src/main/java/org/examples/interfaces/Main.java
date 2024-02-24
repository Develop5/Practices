package org.examples.interfaces;

import static org.examples.Utilities.printDashes;

public class Main {
    public static void main(String[] args) {

        printDashes();

        Bird bird = new Bird();
        AbstractAnimal3 animal = bird;
        FlightEnable flier = bird;
        Trackable tracked = bird;

        animal.move();

        printDashes();
        //flier.move();                   // Does not compile
        //tracked.move();                 // Does not compile

        /*
        // bird is a runtime object, so the methods in Bird class are called.
        // With abstract class and interfaces we are allowed to describe a bird in multiple modes
        // as it belongs to multiple groups.
        flier.takeoff();
        flier.fly();
        tracked.track();
        flier.land();

         */
        inFlight(flier);

        inFlight(new Jet());

        printDashes();

    }

    private static void inFlight(FlightEnable flier) {
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked) {           // instance of works the same with interfaces
            tracked.track();
        }
        flier.land();

    }
}
