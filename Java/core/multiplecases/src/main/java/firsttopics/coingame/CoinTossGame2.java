package main.java.firsttopics.coingame;

import java.util.Scanner;

public class CoinTossGame2 {

    private Scanner scanner ;


    public static void main(String[] args) {
        CoinTossGame2 game = new CoinTossGame2();
        game.scanner = new Scanner(System.in);
        Coin coin = new Coin();

        Player firstPlayer = new Player(game.askPlayerName());
        firstPlayer.setGuess(game.askGuess(firstPlayer.getName()));
        Player secondPlayer = new Player(game.askPlayerName());
        secondPlayer.setGuess((game.setOppositeGuess(firstPlayer.getGuess())));

        System.out.println("Flipping the coin now...");
        coin.flip();
        determineWinner(firstPlayer, secondPlayer, coin);

        game.scanner.close();
    }

    private static void determineWinner(Player firstPlayer, Player secondPlayer, Coin coin) {
        System.out.println(firstPlayer.getName()+ "  = " + firstPlayer.getGuess());
        System.out.println(secondPlayer.getName()+ "  = " + secondPlayer.getGuess());
        System.out.println("Result is : " + coin.getSide());
        String winner = String.format("So, the winner is ....  %s" ,
                firstPlayer.getGuess().equals(coin.getSide()) ? firstPlayer.getName() : secondPlayer.getName());
        System.out.println(winner);
    }

    private String askGuess(String nameOfPlayer) {
        String prompt = String.format("Please %s, make your guess, %s or %s? : ", nameOfPlayer, Coin.HEAD, Coin.TAIL);
        System.out.print(prompt);
        String guess = scanner.nextLine();
        while (!guess.equalsIgnoreCase(Coin.HEAD) && !guess.equalsIgnoreCase(Coin.TAIL)) {
            System.out.print("Ooop! ..It seems there was en error in your guess. Try again : \n" + prompt);
            guess = scanner.nextLine();
        }
        return guess;
    }

    private String askPlayerName () {
        System.out.print("Please, enter your name : ");
        return scanner.nextLine();
    }

    private String setOppositeGuess(String initialGuess) {
        if (initialGuess.equalsIgnoreCase(Coin.HEAD)) return Coin.TAIL;
        else return Coin.HEAD;
    }
}
