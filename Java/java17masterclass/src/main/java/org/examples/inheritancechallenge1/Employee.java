package main.java.org.examples.inheritancechallenge1;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;


    public Employee(long employeeId, String hireDate) {
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    public Employee() {
        super("FromWorker", "02/07/1990", "20/4/2024");
    }

    public Employee(String name, String birthday, String endDate) {
        this(name, birthday, endDate, 397601534, "16/7/1993");
    }

    public Employee(String name, String birthday, String endDate, long employeeId, String hireDate) {
        super(name, birthday, endDate);
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

