package com.UsingAccount;

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account(int id, double balance, double annualInterestRate ) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();

    }

    public boolean withdraw(double amountToWithDraw) {
        if(amountToWithDraw > balance) {
            return false;
        }
        balance -= amountToWithDraw;
        return true;
    }

    public void deposit(double amountToDeposit) {
        balance += amountToDeposit;
    }


    public String toString(){
        return "Account id : " + this.id +
                ", Account balance: " + this.balance +
                ", Account annual interest: " + this.annualInterestRate +
                ", Account creation date: " + this.dateCreated;
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


}
