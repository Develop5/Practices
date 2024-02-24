package org.examples.interfaces;

public enum FlightStages implements Trackable { GRouNDED, LAUNCH, CRUISE, DATACOLLECTION;

    @Override
    public void track() {
        if (this != GRouNDED) {
            System.out.println("Monitoring " + this);
        }
    }
}
