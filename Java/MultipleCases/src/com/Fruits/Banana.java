package com.fruits;

public class Banana extends Fruit{

    public Banana() {
        setCalories(100);
    }

    public void peel() {
        System.out.println("Peeling it is easy");
    }

    @Override
    public void makeJuice() {
        System.out.println("My juice is sweet and dense");
    }
}
