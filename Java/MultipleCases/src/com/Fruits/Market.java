package com.Fruits;

public class Market {

    public static void main(String[] args) {

        Banana bananaForClient1 = new Banana();
        bananaForClient1.makeJuice();
        bananaForClient1.peel();
        bananaForClient1.showCalories();

        Apple appleForClient2 = new Apple();
        appleForClient2.makeJuice();
        appleForClient2.removeHeart();
        appleForClient2.showCalories();

        Fruit fruitForClient3 = new Fruit();
        fruitForClient3.makeJuice();
        fruitForClient3.showCalories();

        fruitForClient3 = new Apple();
        fruitForClient3.makeJuice();


    }
}
