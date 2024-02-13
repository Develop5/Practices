package org.examples.autoboxingAndUnboxingChallenge;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> juanTransactions = new ArrayList<>();
        juanTransactions.add(1000.00);
        Customer juan = new Customer("Juan", juanTransactions);
    }
}
