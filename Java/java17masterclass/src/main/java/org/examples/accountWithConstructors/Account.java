package org.examples.accountWithConstructors;

public class Account {

    protected Account() {
        System.out.println("\n --> An account WITHOUT ANY parameters was created");
    }

    protected Account(String number, double balance, String customerName, String theCustomerEmail, String theCustomerPhone) {
        System.out.println("\n --> An account WITH all parameters has been created");
        // As parameter names are equal to field names (which is a common pactice)
        // then the keyword __this__ needs to be used to differentiate them.
        this.number = number;            // this.field = parameter
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = theCustomerEmail;
        customerPhone = theCustomerPhone;
    }

    protected Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 100.55, customerName, customerEmail, customerPhone);
        System.out.println("\nAccount created with the first 2 parameters as default\n");
    }

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New balance is $" + balance);

    }

    public void withdrawFunds(double withdrawalAmount){
        if (balance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! You only have $" + balance + " in your account");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal of $" + withdrawalAmount + " processed. Remaining balance = $" + balance);
        }
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }


}
