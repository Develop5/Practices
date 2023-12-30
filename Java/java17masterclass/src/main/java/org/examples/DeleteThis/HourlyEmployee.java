package main.java.org.examples.DeleteThis;

import main.java.org.examples.inheritancechallenge1.Employee;

public class HourlyEmployee extends Employee {

    private double hourlyPaidRate;

    public HourlyEmployee(String name, String birthday, String endDate, long employeeId, String hireDate, double hourlyPaidRate) {
        super(name, birthday, endDate, employeeId, hireDate);
        this.hourlyPaidRate = hourlyPaidRate;
    }


    public void getDoublePay() {
        System.out.println("My double pay is : " + hourlyPaidRate * 2);
    }

    @Override
    protected double collectPay() {
        System.out.println("I have worked too many hours!!");
        return hourlyPaidRate * 8000;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPaidRate=" + hourlyPaidRate +
                "} " + super.toString();
    }


}
