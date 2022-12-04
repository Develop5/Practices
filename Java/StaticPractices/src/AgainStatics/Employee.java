package AgainStatics;

public class Employee {
    private static int nextId= 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = advanceId();
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId(){
        return id;
    }

    public static int advanceId(){
        int r = nextId;         // obtain next available id
        nextId++;
        return r;
    }

    public static int getNextId() {
        return nextId;
    }
        // nextId is static. Then, it belongs to the class, not to the object
        // getNextId is also static. Then, similarly it belongs to the class, not to the object

    public static void main(String[] args) {
        // Every class can have a main method
        // If the upper application is called, then the current main method will not be executed
        // To execute this main method, the current class should be called from here
        // So, this is a kind of unit test
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName()+ " " + e.getSalary());
    }

}
