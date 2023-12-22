package accountWithConstructors;

public class Main {
    public static void main(String[] args) {
        Account accountWithoutParameters = new Account();

        Account accountWithParameters = new Account("4", 34.36, "Julio", "julionadaes@julio.com","(9800) 340-68903" );
        System.out.println("Account info for accountWithParameters follows: \n");
        System.out.println("number: " + accountWithParameters.getNumber());
        System.out.println("balance: " + accountWithParameters.getBalance());
        System.out.println("customerName: " + accountWithParameters.getCustomerName());
        System.out.println("Email: " + accountWithParameters.getCustomerEmail());
        System.out.println("Phone: " + accountWithParameters.getCustomerPhome());
        System.out.println("\n--------------------------------------------\n");

        accountWithParameters.withdrawFunds(100);
        accountWithParameters.depositFunds(250);
        accountWithParameters.withdrawFunds(50);

        accountWithParameters.withdrawFunds(200);

        accountWithParameters.depositFunds(100);
        accountWithParameters.withdrawFunds(45.55);
        accountWithParameters.withdrawFunds(54.46);

    }
}
