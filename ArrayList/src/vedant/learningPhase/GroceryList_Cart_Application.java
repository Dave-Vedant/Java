package vedant.learningPhase;

import java.util.ArrayList;

public class GroceryList_Cart_Application {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryList (String item){
        groceryList.add(item);
    }
//========
    public void removeGroceryList(String Item){
        int position = findItem(Item);
        if(position>=0) {
            removeGroceryList(position);
        }
    }
    private void removeGroceryList (int itemNum){             // make it private because now access removing operation by item name;
        groceryList.remove(itemNum);
    }
//======

    public void printGroceryList (){
        System.out.println("Total item/items in your list is/are : " + groceryList.size());
        for(int i = 0; i<groceryList.size(); i++){
            System.out.println((i+1) + " has " + groceryList.get(i));
        }
    }
//==========
    public void modifyGroceryList(String currentItem, String newItem){               // make new method for getting item position , will do same for remove item.
        int position = findItem(currentItem);
        if(position >= 0 ) {
            modifyGroceryList(position,newItem);        // call actual method;

        }
    }
    private void modifyGroceryList(int position, String newItem){
        groceryList.set(position, newItem);
        System.out.println(" Grocery item : " + newItem + " is added to position" + position +1);
    }
//===========

    private int findItem(String searchItem){
//        boolean exists = groceryList.contains(searchItem); // get item for boolean answer but not give the value position;
        return groceryList.indexOf(searchItem);

        /*                                          // no need because of modification of modify grocery list to int outcome;
        if (position>=0){
            return groceryList.get(position);
        }
        return null;
         */
    }

    public boolean onFile(String Item){
        int position = findItem(Item);
        if (position>=0){
            return true;
        }
        return false;
    }
}
