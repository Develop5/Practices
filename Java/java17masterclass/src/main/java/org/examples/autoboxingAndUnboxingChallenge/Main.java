package org.examples.autoboxingAndUnboxingChallenge;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    Customer(String name, double initialDeposit) {
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(initialDeposit);
    }

}
public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob 5", 1000.0);
        System.out.println(bob);
    }
}
