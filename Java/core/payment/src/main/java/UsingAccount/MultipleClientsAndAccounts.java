package main.java.UsingAccount;

public class MultipleClientsAndAccounts {

    public static void main(String[] args) {
        // Create array of 2 clients
        Client[] listOfClients = new Client[2];
        listOfClients[0] = new Client(1111, "Rafael", "232323232323" );
        listOfClients[1] = new Client(2222, "Pedro", "777777777777" );

        // Add 2 accounts for the first client
        listOfClients[0].addAccount(new Account(1122, 3000, 0.62));
        listOfClients[0].addAccount(new Account(1134, 100, 0.45));

        // Add 3 accounts for the second client
        listOfClients[1].addAccount(new Account(2222, 20000, 0.05));
        listOfClients[1].addAccount(new Account(2234, 200, 0.45));
        listOfClients[1].addAccount(new Account(2267, 10, 0.10));

        // Print the information of each client using toString()
        System.out.println(listOfClients[0].toString());
        System.out.println(listOfClients[1].toString());

    }
}
