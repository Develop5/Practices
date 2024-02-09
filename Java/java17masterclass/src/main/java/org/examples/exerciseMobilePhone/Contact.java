package org.examples.exerciseMobilePhone;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public static Contact createContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        return newContact;
    }
}
