package main.java.org.examples.polymorphismChallenge;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n...............................");
        Car car = new Car("2022 Blue Ferrari 296 GTS");
        runRace(car);

        System.out.println("\n...............................");
        GasPoweredCar ferrari = new GasPoweredCar("2022 Blue Ferrari 296 GTS",
                15.4,
                6);
        runRace(ferrari);
    }

    public static void runRace(Car car) {
        car.startEngine();
        car.drive();
    }
}
