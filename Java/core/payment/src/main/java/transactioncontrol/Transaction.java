package main.java.transactioncontrol;

import java.util.Date;

public class Transaction {
    private char type;
    private double amount;
    private double balance;
    private Date date;
    private String description;


    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.date = new Date();
    }

    public char getTransactionType() {
        return this.type;
    }


    public String toString() {
        return "Transaction{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
