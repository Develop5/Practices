package main.java.org.examples.inheritancechallenge1;

public class Employee extends Worker{

    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1;


    public Employee(long employeeId, String hireDate) {
        this.employeeId = employeeId;
        this.hireDate = hireDate;
    }





    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public void terminate(String endDate) {
        super.terminate(endDate);
    }

    @Override
    public double collectPay() {
        return super.collectPay();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

