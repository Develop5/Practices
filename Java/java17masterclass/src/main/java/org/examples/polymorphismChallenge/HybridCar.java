package main.java.org.examples.polymorphismChallenge;
public class HybridCar extends Car{
    private double avmKmPerLiter;
    private int cylinders = 6;
    private int batterySize;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avmKmPerLiter, int cylinders, int batterySize) {
        super(description);
        this.avmKmPerLiter = avmKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up. %n", cylinders);
        System.out.printf("Hybrid -> Switch %d kWh battery on. Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage exceeds the average: %.2f %n", avmKmPerLiter);
    }

}

