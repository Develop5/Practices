package org.examples;

public class Utilities {

    public static void printDashes(int... amount){
        // This way you can print a line of dashes from any package
        if (amount.length > 0) {
            System.out.println("-".repeat(amount[0]));
        } else {
            System.out.println("-".repeat(50));
        }
    }
}
