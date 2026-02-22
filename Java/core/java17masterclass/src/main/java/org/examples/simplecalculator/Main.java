package org.examples.simplecalculator;

public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculadora = new SimpleCalculator();

        calculadora.setFirstNumber(4);
        calculadora.setSecondNumber(0);

        System.out.println("First: " + calculadora.getFirstNumber());
        System.out.println("Second: " + calculadora.getSecondNumber());
        System.out.println("Addition results: " + calculadora.getAdditionResult());
        System.out.println("Substraction results: " + calculadora.getSubstractionResults());
        System.out.println("Multiplication: " + calculadora.getMultiplicationResults());
        System.out.println("Division: " + calculadora.getDivisionResults());

    }
}
