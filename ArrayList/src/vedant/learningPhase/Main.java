package vedant.learningPhase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main<Static> {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList_Cart_Application GroceryList = new GroceryList_Cart_Application();


    public static <Static> void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {                              // (!quit==true)
            System.out.println("Enter the choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Have a nice shopping ! ");
                    printInstructions();
                    break;                                    //            BREAK IS TOO MUCH IMPORTANT TO MOVE FORWARD AFTER CHOICE REPLY, ITS TEDIOUS JOB TO FIND REAL EROOR
                case 1:
                    GroceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    System.out.println("Thank your for visit");
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println(" press ");
        System.out.println(" 0 = for getting instructions");
        System.out.println(" 1 = for list of Grocery Items");
        System.out.println(" 2 = for adding item");
        System.out.println(" 3 = for modify item");
        System.out.println(" 4 = for remove item");
        System.out.println(" 5 = for search item");
        System.out.println( "6 = process array list");
        System.out.println(" 7 = to quit Program");
    }

    public static void addItem() {
        System.out.println(" Please add grocery Item : ");
        GroceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println(" Enter Current Item Number to be replaced : ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new Item Name : ");
        String newItem = scanner.nextLine();
        GroceryList.modifyGroceryList(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter Item Number to be removed (Indexing from 0) : ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        GroceryList.removeGroceryList(itemNo);
    }

    public static void searchItem() {
        System.out.println("Enter Item Name to search for : ");
        //int itemNo = scanner.nextInt();
        String itemName = scanner.nextLine();
        if (GroceryList.onFile(itemName)) {
            System.out.println("Found " + itemName + " in our grocery store");
        } else {
            System.out.println("The item is not available, please contact sales department on ***-*** ****");
        }
    }

    public static void processArrayList(){
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(GroceryList.getGroceryList());
        ArrayList<String> nextArray = new ArrayList<String> (GroceryList.getGroceryList());

        String [] myArray = new String[GroceryList.getGroceryList().size()];
        myArray = GroceryList.getGroceryList().toArray(myArray);
    }
}
