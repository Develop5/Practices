package main.java.org.examples.constructorchaining;

public class Main {
    public static void main(String[] args) {
        ChainingAccount accountChainingConstructor = new ChainingAccount();
        System.out.println(" \nChainingAccount info for accountChainingConstructor follows:");
        System.out.println("number: " + accountChainingConstructor.getNumber());
        System.out.println("balance: " + accountChainingConstructor.getBalance());
        System.out.println("customerName: " + accountChainingConstructor.getCustomerName());
        System.out.println("Email: " + accountChainingConstructor.getCustomerEmail());
        System.out.println("Phone: " + accountChainingConstructor.getCustomerPhone());
        System.out.println("\n--------------------------------------------\n");

        accountChainingConstructor.withdrawFunds(100);
        accountChainingConstructor.depositFunds(250);
        accountChainingConstructor.withdrawFunds(50);

        accountChainingConstructor.withdrawFunds(200);

        accountChainingConstructor.depositFunds(100);
        accountChainingConstructor.withdrawFunds(45.55);
        accountChainingConstructor.withdrawFunds(54.46);

    }
}
