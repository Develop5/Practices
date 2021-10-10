package com.coin.game;

import java.util.Random;

public class Coin {

    public static final String HEAD = "HEAD";
    public static final String TAIL = "TAIL";
    public static String side;
    private static Random random = new Random();

    public String flip() {
        if(random.nextBoolean()) setSide(HEAD);
        else setSide(TAIL);
        return side;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

}
