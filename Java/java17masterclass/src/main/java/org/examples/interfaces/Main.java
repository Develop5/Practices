package org.examples.interfaces;

import java.util.ArrayList;
import java.util.List;

import static org.examples.Utilities.printDashes;
import static org.examples.Utilities.printRepeated;

public class Main {
    public static void main(String[] args) {

        printDashes();

        Bird bird = new Bird();
        AbstractAnimal3 animal = bird;
        FlightEnabled flier = bird;
        Trackable tracked = bird;
        // bird is not an instance of FlightEnabled, but of Bird,
        // which implements in turn FlightEnabled behavior

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

        printRepeated(".", 20);
        inFlight(new Jet());

        printRepeated(".", 20);
        Trackable truck = new Truck();
        truck.track();

        double kmsTraveled = 100;
        double milesTraveled = kmsTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("The truck traveled %.2f km or %.2f miles%n",
                kmsTraveled, milesTraveled);


        printRepeated("+", 20);
        ArrayList<FlightEnabled> fliers = new ArrayList<>();
        // Declare type (left) is the same as the instance type (right)
        fliers.add(bird);

        List<FlightEnabled> betterFliers = new ArrayList<>();
        // Declare type is a list of declared elements and not an ArrayList
        // this is a interface type
        betterFliers.add(bird);

        // Until here, it is not clear that the second declaration is better than the first
        // We will add now some methods to prove that.

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

        printDashes();

    }

    private static void inFlight(FlightEnabled flier) {
        flier.takeoff();
        flier.fly();
        if (flier instanceof Trackable tracked) {           // instance of works the same with interfaces
            tracked.track();
        }
        flier.land();
    }

    public static void triggerFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.takeoff();
        }
    }

    public static void flyFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.fly();
        }
    }

    public static void landFliers(ArrayList<FlightEnabled> fliers) {
        for (var flier : fliers) {
            flier.land();
        }
    }


}
