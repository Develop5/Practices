package com.Animals;

public class Cat extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I meow");
    }

    public void scratch() {
        System.out.println("I know how to scratch things");
    }
}
