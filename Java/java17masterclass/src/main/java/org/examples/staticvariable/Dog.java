package org.examples.staticvariable;

public class Dog {

    private static String name;

    public Dog(String name) {                       // Constructor
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name : " + name);
    }
}
