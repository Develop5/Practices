package org.examples.autoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<Customer> customers = new ArrayList<>(5000);

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Customer getCustomer(String customerName) {
        for (var customer : customers) {
            if (customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasn't found %n", customerName);
        return null;
    }

    public void addNewCustomer(String customerName, double initialDeposit) {
        if (getCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialDeposit);
            customers.add(customer);
            System.out.println("New customer added: " + customer);
        }
        // Checks if newCostumer is in the bank
        //      if true, does nothing
        //      if false, adds it to the list
    }

    public void addTransaction(Customer customer, Double newTransaction) {
        // The customer can add a transaction
    }

    public void printStatement(Customer customer) {
        // Prints customer name and transaction amounts
        // Uses unboxing
    }

    public boolean findCustomerInBank(Customer customer) {
        // Retrieves true if the customer is already in the bank
        return false;
    }

}
