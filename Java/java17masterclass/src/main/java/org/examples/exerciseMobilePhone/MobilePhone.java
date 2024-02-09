package org.examples.exerciseMobilePhone;

import java.util.ArrayList;

public class MobilePhone {
        String myNumber;
        ArrayList<Contact> myContacts;                         // Array of individual contacts


        public MobilePhone(String myNumber) {
                this.myNumber = myNumber;
                ArrayList<Contact> myContacts = new ArrayList<>();
        }


        public boolean addNewContact(Contact contact) {
                if (myContacts.contains(contact)) { return false; } else {
                        myContacts.add(contact);
                        return true;
                }
        }

        public boolean updateContact(Contact oldContact, Contact newContact ) {

                if (!(myContacts.contains(oldContact))) {
                        return false;
                } else {
                        myContacts.set(myContacts.indexOf(oldContact), newContact);
                        return true;
                }
        }

        public boolean removeContact(Contact contact) {
                if (myContacts.indexOf(contact) >= 0) {
                        myContacts.remove(myContacts.indexOf(contact));
                        return true;
                } else {
                        return false;
                }
        }

        public int findContact(Contact contact) {
                return myContacts.indexOf(contact);
        }

        public int findContact(String number) {
                int contactIndex = -1;
                for (Contact contact : myContacts) {
                        if (contact.getPhoneNumber() == number) {
                                contactIndex = myContacts.indexOf(contact);
                        }
                }
                return contactIndex;
        }


        public Contact queryContact(String name) {
                Contact contactFound = null;
                for (Contact element : myContacts) {
                        if (element.getName() == name) {
                                return element;
                        }
                }
                return contactFound;
        }



        public void printContacts() {
                System.out.println("Contact list");
                for (Contact oneContact : myContacts) {
                        System.out.println(oneContact.getName() + " -> " + oneContact.getPhoneNumber());
                }
        }


}
