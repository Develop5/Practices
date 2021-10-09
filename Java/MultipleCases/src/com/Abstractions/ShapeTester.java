package com.abstractions;

public class ShapeTester {
    public static void main(String[] args) {
        Shape particularShape = new Rectangle(3, 4);
        System.out.println(" My area is = " + particularShape.calculateArea());
        particularShape.printWhatIAm();


    }
}
