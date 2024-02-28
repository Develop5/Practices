package org.examples.interfaces;

public interface OrbitEarth extends FlightEnabled {
    void achieveOrbit();

    private static void log(String description) {           // 'public' modifier is not needed
        // If I make this private, any method on this interface can actually call it
        // 'static' establishes that this method can be used by this interface's concrete method
        // That will provoke an error on the Test class

        var today = new java.util.Date();
        System.out.println(today + " : " + description);
    }

    private void logStage(FlightStages stage, String description) {
        description = stage + ": " + description;
        log(description);
        // We can only call a private method from another private method or a default method

    }

    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        // I am taking what comes from FlightEnable to transition method
        logStage(stage, "Beginning transition to " + nextStage);
        return nextStage;
    }
}
