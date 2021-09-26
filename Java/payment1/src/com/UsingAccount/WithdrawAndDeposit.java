package com.UsingAccount;

public class WithdrawAndDeposit {
    public static void main(String[] args) {

        // Create a new account
        Account testAccount = new Account(1122, 20000, 4.5);

        // Withdrawing 2500 from the account
        if(testAccount.withdraw(2500)) {
            System.out.println("You have withdrawn 2500 from your account");
            System.out.println("Your current balance is = " + testAccount.getBalance());
        } else {
            System.out.println("Sorry... Not enough money");
        }

        // Deposit 3000 to the account
        testAccount.deposit(3000);

        // Print the account information
        System.out.println("Account id = " + testAccount.getId());
        System.out.println("Balance = " + testAccount.getBalance());
        System.out.println("Annual Interest Rate = " + testAccount.getAnnualInterestRate() +
                ",  Date Created : " + testAccount.getDateCreated());

    }
}
