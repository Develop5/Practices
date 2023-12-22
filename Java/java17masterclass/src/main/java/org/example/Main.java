//package src.main.java.org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Account bobsAccount = new Account();


        bobsAccount.withdrawFunds(100);
        bobsAccount.depositFunds(250);
        bobsAccount.withdrawFunds(50);

        bobsAccount.withdrawFunds(200);

        bobsAccount.depositFunds(100);
        bobsAccount.withdrawFunds(45.55);
        bobsAccount.withdrawFunds(54.46);
    }


}