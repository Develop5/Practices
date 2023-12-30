package main.java.org.examples.inheritancechallenge1;


public class HourlyEmployee extends Employee {

    private double hourlyPaidRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPaidRate) {
        super(name, birthDate, hireDate);
        this.hourlyPaidRate = hourlyPaidRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPaidRate;         // Suppose he/she works 40 h/w and is paid weekly
    }

    public double getDoublePay() {          // The type was not mentioned in the exercise description
        return 2 * collectPay();
    }


    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPaidRate=" + hourlyPaidRate +
                "} " + super.toString();
    }


}
