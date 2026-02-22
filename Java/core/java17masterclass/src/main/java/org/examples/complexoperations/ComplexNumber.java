package org.examples.complexoperations;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal(){
        return real;
    }

    public double getImaginary(){
        return imaginary;
    }

    public void add(double complexReal, double complexImaginary) {
        real += complexReal;
        imaginary += complexImaginary;
    }

    public void add(ComplexNumber complex) {
        real += complex.getReal();
        imaginary += complex.getImaginary();
    }


    public void subtract(double complexReal, double complexImaginary) {
        real -= complexReal;
        imaginary -= complexImaginary;
    }

    public void subtract(ComplexNumber complex) {
        real -= complex.getReal();
        imaginary -= complex.getImaginary();
    }
}
