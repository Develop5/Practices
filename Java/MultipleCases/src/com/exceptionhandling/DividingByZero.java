package com.exceptionhandling;

public class DividingByZero {
    public static void main(String[] args) {
            try {
                int c = 30/0;
                System.out.println("Division result = " + c);
            } catch (ArithmeticException e) {
                System.out.println("\n\n *************  There has been an error **********");
                e.printStackTrace();

            } finally {
                System.out.println("Division is fun");
            }
    }
}
