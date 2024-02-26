package org.examples.interfaces;

public interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    static void log(String description) {           // 'public' modifier is not needed
        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }
}
