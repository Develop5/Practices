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

    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", customers=" + customers +
                '}';
    }

    public void addTransaction(String name, double transactionAmount) {
        Customer customer = getCustomer(name);
        if (customer != null) {
            customer.transactions().add(transactionAmount);
        }
    }

    public void printStatement(String customerName) {
        Customer customer = getCustomer(customerName);
        if (customer == null) {
            return;
        }
        System.out.println("_".repeat(30));
        System.out.println("Customer name : " + customerName);
        System.out.println("Transactions : ");
        for (double d: customer.transactions()) {
            System.out.printf("$%10.2f (%s)%n", d, d < 0 ? "debit" : "credit");
        }
    }

    public void findCustomerInBank(String customerName) {


        // Retrieves true if the customer is already in the bank
    }

}
