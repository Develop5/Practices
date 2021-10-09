package com.inheritance;

public class TasteTester {
    public static void main(String[] args) {
        WeddingCake currentWedding = new WeddingCake();
        currentWedding.setFlavor("Chocolate");
        currentWedding.setPrice(12.96);
        currentWedding.setHusbandName("Alfred");
        currentWedding.setWifeName("Glenda");

        BirthdayCake clientBirthday = new BirthdayCake();
        clientBirthday.setFlavor("Vanilla");
        clientBirthday.setPrice(5.40);
        clientBirthday.setCandles(24);

    }
}
