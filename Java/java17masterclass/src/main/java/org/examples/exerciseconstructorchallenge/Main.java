package main.java.org.examples.exerciseconstructorchallenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("\n---------------------------------");
        System.out.println("Exercise 1: Constructor with all parameters");
        Customer peter = new Customer("peter", 600.0, "pedrolast@unique.com");
        System.out.println("Name: " + peter.getName()
                + "\t\tCredit Limit: " + peter.getCreditLimit()
                + "\t\tEmail: " + peter.getEmailAddress());

        System.out.println("\n---------------------------------");
        System.out.println("Exercise 2: No-args constructor");
        System.out.println("Shoulc be -> Name : AnyName   Credit: 20.56   email: anyname@itsemail.com");
        Customer charlie = new Customer();
        System.out.println("Name: " + charlie.getName()
                + "\t\tCredit Limit: " + charlie.getCreditLimit()
                + "\t\tEmail: " + charlie.getEmailAddress());

        System.out.println("\n---------------------------------");
        System.out.println("Exercise 3: Only name and email constructor");
        System.out.println("Should be -> Credit: 90.0");
        Customer gustav = new Customer("gustav", "gustavemail@nonexistent.com");
        System.out.println("Name: " + gustav.getName()
                + "\t\tCredit Limit: " + gustav.getCreditLimit()
                + "\t\tEmail: " + gustav.getEmailAddress());
    }
}
