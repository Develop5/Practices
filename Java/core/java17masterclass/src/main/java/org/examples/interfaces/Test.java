package org.examples.interfaces;

import static org.examples.Utilities.printRepeated;

public class Test {
    public static void main(String[] args) {

        printRepeated("*", 20);

        inFlight(new Jet());
        //OrbitEarth.log("Testing" + new Satellite());

        orbit(new Satellite());
        // Does not produce any output because nothing is printed out from the Satellite methods.

        printRepeated("*", 20);

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeoff();
        flier.transition(FlightStages.LAUNCH);
        flier.fly();
        if (flier instanceof Trackable tracked) {           // instance of works the same with interfaces
            tracked.track();
        }
        flier.land();
    }

    private static void orbit (OrbitEarth flier) {
        // We use now the interface we have just changed
        // Then, Satellite is the only interface that implements OrbitEarth
        flier.takeoff();
        flier.fly();
        flier.land();
    }

}
