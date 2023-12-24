package constructorchaining;

import accountWithConstructors.Account;

public class Main {
    public static void main(String[] args) {
        //Account accountChainingConstructor = new Account("4", 34.36, "Julio", "julionadaes@julio.com","(9800) 340-68903" );
        Account accountChainingConstructor = new Account();
        System.out.println("Account info for accountChainingConstructor follows: \n");
        System.out.println("number: " + accountChainingConstructor.getNumber());
        System.out.println("balance: " + accountChainingConstructor.getBalance());
        System.out.println("customerName: " + accountChainingConstructor.getCustomerName());
        System.out.println("Email: " + accountChainingConstructor.getCustomerEmail());
        System.out.println("Phone: " + accountChainingConstructor.getCustomerPhome());
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
