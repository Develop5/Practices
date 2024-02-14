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
        System.out.println("\n" + "_".repeat(50));

        Customer bob = new Customer("Bob 5", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A", 500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("jane A", -75.1);
        bank.printStatement("Jane a");

        System.out.println("\n" + "_".repeat(50));

    }
}
