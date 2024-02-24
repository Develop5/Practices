package org.examples.interfaces;

public class Satellite implements OrbitEarth{

    public void achieveOrbit() {
        System.out.println("Orbit achieved!");
    }

    @Override
    public void takeoff() {

    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }
}
