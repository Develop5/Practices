package accountWithConstructors;

public class Account {

    public Account() {
        System.out.println("\n --> An account WITHOUT ANY parameters was created");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhome) {
        System.out.println("\n --> An account WITH all parameters has been created");
    }
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhome;

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

    public String getCustomerPhome() {
        return customerPhome;
    }

    public void setCustomerPhome(String customerPhome) {
        this.customerPhome = customerPhome;
    }


}
