package org.examples.autoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Customer {

    String customerName;
    ArrayList<Double> transactions;
    // Credit is positive amount
    // Debit is negative amount


    public Customer(String customerName, ArrayList<Double> transactions) {
        this.customerName = customerName;
        this.transactions = transactions;
    }
}
