package org.examples.interfaces;

import static org.examples.Utilities.printRepeated;

public class Test {
    public static void main(String[] args) {

        printRepeated("*", 20);

        inFlight(new Jet());
        OrbitEarth.log("Testing" + new Satellite());

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
}
