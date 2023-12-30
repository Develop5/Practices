package main.java.org.examples.inheritancechallenge1;

import main.java.org.examples.inheritancechallenge1.Employee;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;           // Let's suppose he/she is paid every other week
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;
        return (int) adjustedPay;
    }

    public void retire() {
        terminate("12/12/2025");
        // As long as "terminate" method is not overridden this method
        // can be used like that by all descendants.

        isRetired = true;
    }


    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
