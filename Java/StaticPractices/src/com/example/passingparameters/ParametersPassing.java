package com.example.passingparameters;



/**
 * To show how to pass parameters in Java
 */
public class ParametersPassing {
    public static void main(String[] args) {
        /*
         Case 1: Methods cannot modify numeric parameters
        */
        System.out.println("Testing tripleValue ********* ");
        double percent = 10;
        System.out.println("Before: percent = " + percent);
        tripleValue(percent);
        System.out.println("After: percent = " + percent);

        /*
         Case 2: methods can change the state of object parameters
        */

        System.out.println("\nTesting tripleSalary ********* ");
        Employee harry = new Employee("Harry", 50000);
        System.out.println("Before: salary = " + harry.getSalary());
        tripleSalary(harry);
        System.out.println("After: salary= " + harry.getSalary());

        /*
        Case 3: Methods cannot attach new objects to object parameters
        */
        System.out.println("\nTesting swap ********* ");
        Employee a = new Employee("Alice", 70000);
        Employee b = new Employee("Bob", 60000);
        System.out.println("Before: a= " + a.getName());
        System.out.println("Before: b= " + b.getName());
        swap(a, b);
        System.out.println("After: a= " + a.getName());
        System.out.println("After: b= " + b.getName());
    }

    public static void tripleValue(double valueToBeTripled) {      // does not work
        // valueToBeTripled is initialized with a "copy" of the value provided
        // Works the number but doesn't affect the variable provided
        valueToBeTripled *= 3;
        System.out.println("End of method: valueToBeTripled = " + valueToBeTripled);
    }
    public static void tripleSalary(Employee employeeName){    //works
        // the object is received and its field is modified
        employeeName.raiseSalary(200);
        System.out.println("End of method: salary = " + employeeName.getSalary());
    }
    public static void swap(Employee refemployee1, Employee refemployee2){
        // temp, refemployee1 and refemployee2 variables store the name of the object
        // Therefore, the final variables show the fields of the
        // corresponding objects, which have not been changed.
        Employee temp = refemployee1;
        refemployee1 = refemployee2;
        refemployee2 = temp;
        System.out.println("End of method: refemployee1= " + refemployee1.getName());
        System.out.println("End of method: refemployee2= " + refemployee2.getName());
    }

}
