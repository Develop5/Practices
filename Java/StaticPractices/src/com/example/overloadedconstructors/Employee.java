package com.example.overloadedconstructors;

import java.util.Random;

public class Employee {
    private static int nextId;

    private int id;
    private String name = "";   // 6) instance field initialization
    private double salary;

    private static Random generator = new Random();

    // 5) static initialization block
    static {                    // this is the keyword
        // set nextId to a random number between 0 and 9999
        nextId = generator.nextInt(10000);
    }

    // 4) object initialization block
    {
        this.id = nextId;
        nextId++;
    }

    // 1) Three overloaded constructors
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee(double salary) {
        // calls the Employee(String, double) constructor
        // 2) A call to another constructor
        this("Employee #" + nextId, salary);
    }

    // the default constructor
    // 3) no-argument constructor
    public Employee(){
        // name initialized to "" -- see above
        // salary not explicitly set -- initialized to 0
        // id initialized in initialization block
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public int getId() {
        return this.id;
    }
}
