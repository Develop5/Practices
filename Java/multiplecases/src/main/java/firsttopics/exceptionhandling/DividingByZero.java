package main.java.firsttopics.exceptionhandling;

public class DividingByZero {
    public static void main(String[] args) {
            try {
                // The following should produce Numeric overflow in expression. Division by zero
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
