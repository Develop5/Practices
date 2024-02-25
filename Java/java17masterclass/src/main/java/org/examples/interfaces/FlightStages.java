package org.examples.interfaces;

public enum FlightStages implements Trackable { GROUNDED, LAUNCH, CRUISE, DATACOLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }

    public FlightStages getNextStage(){
        // We will avoid to use the enum values explicitly, in case they change
        FlightStages[] allStages = values();
        return allStages[(ordinal() + 1) % allStages.length];   // Scan to all stages and go back to 1
        // Cycling to stages
    }
}
