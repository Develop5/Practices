package main.java.org.examples.polymorphismChallenge;
public class ElectricCar extends Car{
    private double avmKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avmKmPerCharge, int batterySize) {
        super(description);
        this.avmKmPerCharge = avmKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.printf("BEV -> Switch %d kWh battery on, Ready!%n", batterySize);
    }

    @Override
    protected void runEngine() {
        System.out.printf("BEV -> usage under the average: %.2f %n", avmKmPerCharge);
    }


}

