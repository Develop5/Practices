package AgainStatics;

public class SimpleStatics {
    /**
     * Program to demonstrate static methods
     */
    public static void main(String[] args) {
        // fill staff array with three Employ objects

        System.out.println("******************************");
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Tom", 55000);
        staff[1] = new Employee("Dick", 60000);
        staff[2] = new Employee("Harry", 65000);

        // print out salary information about all Employees
        for (Employee e:staff) {
            System.out.println("name= " + e.getName()
                    + " , id= " + e.getId()
                    + " , salary = " + e.getSalary());
        }

        int n = Employee.getNextId();       // calls static method
        System.out.println("Next available id= " + n);
    }
}
