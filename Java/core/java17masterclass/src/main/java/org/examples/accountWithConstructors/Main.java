package org.examples.accountWithConstructors;

public class Main {
    public static void main(String[] args) {

        Account accountWithoutParameters = new Account();
        System.out.println("\n--------------------------------------------\n");

        Account accountWithParameters = new Account("4", 34.36, "Julio", "julionadaes@julio.com","(9800) 340-68903" );
        System.out.println("ChainingAccount info for accountWithParameters follows: \n");
        System.out.println("number: " + accountWithParameters.getNumber());
        System.out.println("balance: " + accountWithParameters.getBalance());
        System.out.println("customerName: " + accountWithParameters.getCustomerName());
        System.out.println("Email: " + accountWithParameters.getCustomerEmail());
        System.out.println("Phone: " + accountWithParameters.getCustomerPhone());
        System.out.println("\n--------------------------------------------\n");

        accountWithParameters.withdrawFunds(100);
        accountWithParameters.depositFunds(250);
        accountWithParameters.withdrawFunds(50);
        accountWithParameters.withdrawFunds(200);
        accountWithParameters.depositFunds(100);
        accountWithParameters.withdrawFunds(45.55);
        accountWithParameters.withdrawFunds(54.46);

        Account timsAccount = new Account("Tim",
                "timthebest@tim.com",
                "(549) 67148-3344");
        System.out.println("Account parameters info for timsAccount follows: \n");
        System.out.println("number: " + timsAccount.getNumber());
        System.out.println("balance: " + timsAccount.getBalance());
        System.out.println("customerName: " + timsAccount.getCustomerName());
        System.out.println("Email: " + timsAccount.getCustomerEmail());
        System.out.println("Phone: " + timsAccount.getCustomerPhone());
        System.out.println("\n--------------------------------------------\n");

    }
}
