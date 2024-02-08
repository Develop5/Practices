package org.examples.exerciseMobilePhone;

import java.util.ArrayList;

public class MobilePhone {
        String myNumber;
        ArrayList<Contacts> myContacts;


        public MobilePhone(String myNumber) {
                this.myNumber = myNumber;
                ArrayList<Contacts> myContacts = new ArrayList<>();

        }



        public boolean addNewContact(Contacts contact) {
                // It is missing here whether the contact will be added
                // Issue: I am not receiving an element type Contact but a whole ArrayList
                return myContacts.contains(contact);
        }

        /*
                -  updateContact(), has two parameters of type Contact (the old contact that will be updated with the new contact) and returns a boolean.
                Returns true if the contact exists and was updated successfully, or false if the contact doesn't exists.
         */

        public boolean updateContact(Contacts oldContact, Contacts newContact ) {
                // Issue: I am not receiving an element type Contact but a whole ArrayList

                if (!(myContacts.contains(oldContact))) {
                        return false;
                } else {
                        // My code here
                        return true;
                }
        }

}
