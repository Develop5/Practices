package main.java.org.examples.constructorchaining;

public class ChainingAccount {

    protected ChainingAccount() {
        // From the moment we write "this" here, the other constructor is referenced
        // and its parameters are expected to be declared here
        this ("56789", 2.50, "Default Name", "Default email", "Default phone");
        System.out.println("\n --> An account is created by using a CHAINING constructor");
    }

    protected ChainingAccount(String number, double balance, String customerName, String theCustomerEmail, String theCustomerPhone) {
        System.out.println("\n --> An account WITH parameters settled by user has been created");
        // As parameter names are equal to field names (which is a common pactice)
        // then the keyword __this__ needs to be used to differentiate them.

        this.number = number;            // this.field = parameter
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = theCustomerEmail;
        customerPhone = theCustomerPhone;
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
