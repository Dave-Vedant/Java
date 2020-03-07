package vedant.learningPhase;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new java.util.Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("226 975 3201");

    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("press 6 to see the actions");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:                                                                   //self exist
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;                                     // get method from mobilePhone class...
                case 2:
                    addNewContacts();
                    break;
                case 3:
                    updateContacts();
                    break;
                case 4:
                    removeContacts();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printAction();
                    break;
            }
        }


    }
//==========================================================================================
    private static void startPhone(){
        System.out.println("Starting Phone...");
        System.out.println("Contact list saved.");
    }

    private static void printContacts(){                                                  //case 1
        mobilePhone.printContacts();
    }
//============================================================================================
    private static void addNewContacts(){                                                 //case 2
        System.out.println("Add new Contact");
        System.out.println("Enter new contact Name:");
        String name = scanner.nextLine();
        System.out.println("Enter new contact Number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name,phone);
        if (mobilePhone.addNewContact(newContact)){
            System.out.println(" New contact added: name  = " + name + "phone: " + phone);
        } else {
            System.out.println("Contact are already exist");
        }
    }
// ========================================================================================
    private static void updateContacts(){                                                   //case 3
        System.out.println("Update Contacts");
        System.out.println("Enter existing contact name" );
        String name  = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new Phone no: ");
        String newPhoneNo = scanner.nextLine();
        Contact newContact  = Contact.createContact(newName, newPhoneNo);
        if (mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("Successfully updated records");
        } else {
            System.out.println("Error in record update, plz try again.");
        }
    }

//===================================================================================================

    private static void removeContacts(){                                                //case 4
        System.out.println("Remove contact");
        System.out.println("Enter existing contact name" );
        String name  = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null){
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContact)){
            System.out.println("Successfully updated records");
        } else {
            System.out.println("Error in record update, plz try again.");
        }
    }
// =======================================================================================================
    private static void queryContact() {                                                    //case 5
        System.out.println("Query Contact");
        System.out.println("Enter existing contact name");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("Contact not found");
            return;
        } else {
            System.out.println("Name : " + existingContact.getName() + " phone No : " + existingContact.getPhoneNumber());
        }
    }

//========================================================================================================

    private static void printAction(){                                                      // case 6
        System.out.println("\n available options: \n press");
        System.out.println("0 = to shutdown \n" +
                "1 = to print Actions \n" +
                "2 = to add new contact \n" +
                "3 = to update existing contact list \n" +
                "4 = to remove contact from contact list \n" +
                "5 = query for existing contact in contact list \n" +
                "6 = to print list of available options" );
    }
}
// ======================================================================================================