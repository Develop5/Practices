package org.examples;

public class Utilities {

    public static void printDashes(int... amount){
        // This way you can print a line of dashes from any package
        // The amount is optional. If not specified, it is printed 50 times
        if (amount.length > 0) {
            System.out.println("-".repeat(amount[0]));
        } else {
            System.out.println("-".repeat(50));
        }
    }

    public static void printRepeated(String characters, int... amount) {
        // You print a desired character n times
        // If 'amount' is not specified, this is printed 50 times
        if (amount.length > 0) {
            System.out.println(characters.repeat(amount[0]));
        } else {
            System.out.println(characters.repeat(50));
        }
    }
}
