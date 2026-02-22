package main.java.transactioncontrol;


import java.util.ArrayList;

public class MovementsOfAccounts {
    public static void main(String[] args) {

        // Create an array of accounts
        ArrayList<Account> listOfAccounts = new ArrayList<>();

        Client individual = new Client(2222, "Alex", "555599990000");
        ArrayList<Account> accountList = new ArrayList<>();
        accountList.add(new Account(4444, 3000, 0.15, individual));
        accountList.add(new Account(5555, 12000, 0.45, individual));

        // Move some money
        accountList.get(0).deposit(14000);
        accountList.get(0).withdraw(1000);
        accountList.get(0).withdraw(2000);
        accountList.get(0).withdraw(4000);
        accountList.get(0).deposit(2000);

        accountList.get(1).deposit(1000);
        accountList.get(1).withdraw(100);

        // Display the number of transactions for each account
        for (Account currentAccount : accountList) {
            System.out.println("----------------------------------------------");
            System.out.println("All information of this account : " + currentAccount.toString());
        }




    }
}
