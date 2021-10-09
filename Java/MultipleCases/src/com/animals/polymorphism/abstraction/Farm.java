package com.animals.polymorphism.abstraction;

public class Farm {

    public static void main(String[] args) {

        Animals pig14 = new Pig();
        pig14.eat("leftovers");
        pig14.makeSound();

        System.out.println("-------------");
        Animals duckForever = new Duck();
        duckForever.eat("weeds");
        duckForever.makeSound();

    }
}
