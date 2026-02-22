package main.java.transactioncontrol;

import java.util.ArrayList;

public class Client {

    private int id;
    private String name;
    private String phone;
    private ArrayList<Account> accounts;

    public Client(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        accounts = new ArrayList<>();
    }

    public boolean addAccount(Account singleAccount) {
        accounts.add(singleAccount);
        return true;
    }

    public boolean removeAccount(int idToRemove) {
        for (Account item : accounts) {
            if (item.getId() == idToRemove) {
                accounts.remove(item);
                return true;
            }
        }
        return false;
    }

    public String toString(){
        StringBuilder clientAndAccounts = new StringBuilder("id: " + this.id + ", name: " + this.name + ", phone: " + this.phone + "\n");
        for (Account item : accounts) {
            clientAndAccounts.append(item.toString()).append("\n");
        }
        return clientAndAccounts.toString();
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }



}
