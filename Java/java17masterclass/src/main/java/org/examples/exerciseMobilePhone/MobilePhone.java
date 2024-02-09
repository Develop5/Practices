package org.examples.exerciseMobilePhone;

import java.util.ArrayList;

public class MobilePhone {
        private String myNumber;
        private ArrayList<Contact> myContacts;                         // Array of individual contacts


        public MobilePhone(String myNumber) {
                this.myNumber = myNumber;
                ArrayList<Contact> myContacts = new ArrayList<>();
        }


        public boolean addNewContact(Contact contact) {
                if (findContact(contact) > -1) {
                        myContacts.add(contact);
                        return true;
                } else {
                        return false;
                }
        }

        public boolean updateContact(Contact oldContact, Contact newContact ) {
                if (findContact(oldContact) == -1) {
                        return false;
                } else {
                        myContacts.set(myContacts.indexOf(oldContact), newContact);
                        return true;
                }
        }

        public boolean removeContact(Contact contact) {
                if (findContact(contact) > -1) {
                        myContacts.remove(myContacts.indexOf(contact));
                        return true;
                } else {
                        return false;
                }
        }

        private int findContact(Contact contact) {
                return myContacts.indexOf(contact);
        }

        private int findContact(String name) {
                int contactIndex = -1;
                for (Contact contact : myContacts) {
                        if (contact.getPhoneNumber() == name) {
                                contactIndex = myContacts.indexOf(contact);
                        }
                }
                return contactIndex;
        }

        public Contact queryContact(String name) {
                int indexQueryContact = findContact(name);
                if (indexQueryContact > -1 ) {
                        return myContacts.get(indexQueryContact);
                }
                return null;
        }

        public void printContacts() {
                System.out.println("Contact List:");
                for (Contact oneContact : myContacts) {
                        System.out.println(oneContact.getName() + " -> " + oneContact.getPhoneNumber());
                }
        }


}
