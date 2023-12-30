package main.java.org.examples.inheritancechallenge1;

public class HourlyEmployee extends Employee{

    private double hourlyPaidRate;

    public HourlyEmployee(String name, String birthday, String endDate, long employeeId, String hireDate, double hourlyPaidRate) {
        super(name, birthday, endDate, employeeId, hireDate);
        this.hourlyPaidRate = hourlyPaidRate;
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyPaidRate=" + hourlyPaidRate +
                "} " + super.toString();
    }

    public void getDoublePay() {
        System.out.println("My double pay is : " + hourlyPaidRate * 2);
    }

}
