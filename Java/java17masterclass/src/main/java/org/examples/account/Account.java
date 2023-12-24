package main.java.org.examples.account;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    protected void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);

    }

    protected void withdrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have $" + balance + " in your account");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + balance);
        }
    }
    protected String getNumber() {
        return number;
    }

    protected void setNumber(String number) {
        this.number = number;
    }

    protected double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected String getCustomerName() {
        return customerName;
    }

    protected void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    protected String getCustomerEmail() {
        return customerEmail;
    }

    protected void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    protected String getCustomerPhone() {
        return customerPhone;
    }

    protected void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }
}
