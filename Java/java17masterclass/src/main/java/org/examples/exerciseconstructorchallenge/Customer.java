package main.java.org.examples.exerciseconstructorchallenge;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    protected Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    protected Customer(){
        this("AnyName", 20.56, "anyname@itsemail.com");
        System.out.println("Empty Customer constructor");
    }

    public Customer(String name, String emailAddress) {
        this(name, 90.0, emailAddress );
    }


    protected String getName() {
        return name;
    }

    protected double getCreditLimit() {
        return creditLimit;
    }

    protected String getEmailAddress() {
        return emailAddress;
    }
}
