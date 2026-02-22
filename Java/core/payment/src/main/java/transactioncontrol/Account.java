package main.java.transactioncontrol;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    private Client client;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(int id, double balance, double annualInterestRate, Client client ) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.client = client;
        this.dateCreated = new Date();
    }

    public boolean withdraw(double amountToWithDraw) {
        if(amountToWithDraw > balance) {
            return false;
        }
        balance -= amountToWithDraw;                // Successful
        transactions.add(new Transaction('W', amountToWithDraw, this.balance, "Withdrawn" ));
        return true;
    }

    public void deposit(double amountToDeposit) {
        balance += amountToDeposit;
        transactions.add(new Transaction('D', amountToDeposit, this.balance, "Deposited"));
    }

    public int countTransactions(char type) {
        int counter = 0;
        for (Transaction oneTransaction : transactions) {
            if (oneTransaction.getTransactionType() == type) {counter++;}
        }
        return counter;
    }

    public String toString(){
        return "Account id : " + this.id +
                "\n Account balance: " + this.balance +
                "\n Account annual interest: " + this.annualInterestRate +
                "\n Account creation date: " + this.dateCreated +
                "\n Total withdrawals: " + this.countTransactions('W') +
                "\n Total deposits: " + this.countTransactions('D') +
                "\n Transactions: " + this.transactions.toString() +
                "\n Client: " + this.client;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }
}
