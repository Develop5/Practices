package org.examples.interfaces;

public enum FlightStages implements Trackable { GROUNDED, LAUNCH, CRUISE, DATACOLLECTION;

    @Override
    public void track() {
        if (this != GROUNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}
