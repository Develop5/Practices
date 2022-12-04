package com.example.passingparameters;

class Employee {     // Simplified Employee class
    private String name;
    private double salary;
    public Employee(String nameProvided, double salaryProvided) {
        this.name = nameProvided;
        this.salary = salaryProvided;
    }

    public String getName() {return this.name;}

    public double getSalary() {return this.salary;}

    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }


}
