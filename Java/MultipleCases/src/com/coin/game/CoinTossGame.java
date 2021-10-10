package com.coin.game;

import java.io.IOError;
import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        String flippingResult;
        Coin coin = new Coin();

        Player firstPlayer = new Player("Alfred");
        Player secondPlayer = new Player("Tom");

        firstPlayer.setGuess(askPlayer(firstPlayer.getName()));
        secondPlayer.setGuess(setOpposite(firstPlayer.getGuess()));

        flippingResult = coin.flip();
        showResult(firstPlayer, secondPlayer, flippingResult);
    }


    private static void showResult(Player firstPlayer, Player secondPlayer, String flippingResult) {
        System.out.println(firstPlayer.getName() + " = " + firstPlayer.getGuess());
        System.out.println(secondPlayer.getName() + " = " + secondPlayer.getGuess());
        System.out.println("Result is : " + flippingResult);
        System.out.println("So, the winner is ...  = " +
                (firstPlayer.getGuess().equals(flippingResult) ? firstPlayer.getName() : secondPlayer.getName())  +
                " !!!");
    }

    public static String askPlayer(String name) {
        String answer = "";
        try(Scanner coinReader = new Scanner(System.in)) {
            System.out.println("\n-------------------------------------------");
            System.out.print("Please " + name + ", choose HEAD or TAIL >>  ");
            answer = coinReader.next().toUpperCase();
            if(!answer.contentEquals(Coin.HEAD) && !answer.contentEquals(Coin.TAIL) ) {
                throw new IllegalArgumentException("We do not allow this value ");
            }
        } catch (IOError e) {
            System.out.println("I do not know what happened");
            e.printStackTrace();
        }
        return answer;
    }

    public static String setOpposite(String initialGuess) {
        if ( initialGuess.equals(Coin.HEAD)) return Coin.TAIL;
        return Coin.HEAD;
    }
}
