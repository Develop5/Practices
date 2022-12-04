package com.Fruits;

public class Market {

    public static void main(String[] args) {

        Banana bananaForClient1 = new Banana();
        bananaForClient1.makeJuice();
        bananaForClient1.peel();
        bananaForClient1.showCalories();
        System.out.println();

        Apple appleForClient2 = new Apple();
        appleForClient2.makeJuice();
        appleForClient2.removeHeart();
        System.out.println();

        Fruit fruitForClient3 = new Fruit();
        fruitForClient3.makeJuice();
        System.out.println();

        fruitForClient3 = new Apple();
        fruitForClient3.makeJuice();
        ((Apple) fruitForClient3).removeHeart();            // Right click to Cast



    }
}
