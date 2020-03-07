package vedant.learningPhase;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;
// ========================================================< constructor > =====================================
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

/*
    public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

 */


//                   >>>===============< following are methods for main calling >=====================<<<

// ==============================================================================
    private int findContact(Contact contact){                       //find by contact
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {                         // find by contactName
        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

// ===========================================================================================
    public boolean addNewContact(Contact contact){
        if(findContact(contact)>=0){
            System.out.println("Contact is already in file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }
// ===============================================================================================
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if ((foundPosition) < 0) {
            System.out.println("Contact is not found");
            return false;
        } else if (findContact(newContact.getName()) != -1) {                      // check update duplicacy.
            System.out.println("Contact with name : " + newContact.getName() + " is already exists. plz check contact list");
        }
        this.myContacts.set(foundPosition,newContact);
        return true;
    }
// ===============================================================================================
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if ((foundPosition) < 0) {
            System.out.println("Contact is not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + "Contact is deleted");
        return true;
    }

//=================================================================================================
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i <this. myContacts.size(); i++){
            System.out.println((i+1) + " " +
                    this.myContacts.get(i).getName() + " ===> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
//=========================================================================================================

    public String queryContact(Contact contact){                    //by contact no
        if (findContact(contact)>=0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){                                //by name
        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

}

