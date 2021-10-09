package com.fruits;

public class Fruit {

    public double calories;

    public void makeJuice() {
        System.out.println("Juice is made");
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void showCalories() {
        System.out.format("I contribute with %.1f calories %n", getCalories());
    }
}
