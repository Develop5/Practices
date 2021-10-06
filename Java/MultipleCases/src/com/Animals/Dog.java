package com.Animals;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("I bark");
    }

    public void fetch(){
        System.out.println("I know how to fetch");
    }
}
