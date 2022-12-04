package com.example.overloadedconstructors;

public class SomeConstructors {
    /**
     The following features are shown through the code:
     1) Overloaded constructors
     2) A call to another constructor with "this(...)"
     3) A no-argument constructor
     4) An object initialization block
     5) A static initialization block
     6) An instance field initialization
     */
    public static void main(String[] args) {
        // Create the staff array with 3  Employee objects
        Employee[] staff = new Employee[3];

        // We are calling 3 overloaded constructors
        staff[0] = new Employee("Harry", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee();

        for (Employee e:staff) {
            System.out.println("name = " + e.getName()
                    + " id= " + e.getId()
                    + " salary = " + e.getSalary());
        }
    }
}
