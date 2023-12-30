package main.java.org.examples.DeleteThis;

import main.java.org.examples.inheritancechallenge1.Employee;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthday, String endDate, long employeeId, String hireDate, double annualSalary, boolean isRetired) {
        super(name, birthday, endDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    public void retire() {
        System.out.println("Am I retired? " + (isRetired ? "Yes" : "No"));
    }

    @Override
    protected double collectPay() {
        return annualSalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }
}
