package org.examples.polymorphismChallenge;
public class GasPoweredCar extends Car{
    private double avmKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avmKmPerLiter, int cylinders) {
        super(description);
        this.avmKmPerLiter = avmKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avmKmPerLiter);
    }


}

