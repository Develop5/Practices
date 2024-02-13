package org.examples.autoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Bank {
    String bankName;
    ArrayList<String> customers;

    public void addNewCustomer(Customer newCostumer) {
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
