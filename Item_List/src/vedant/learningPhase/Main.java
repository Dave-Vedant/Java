package vedant.learningPhase;

import javax.swing.plaf.multi.MultiListUI;

public class Main {

    public static void main(String[] args) {
	// write your code here

        myLinkedList mylist = new myLinkedList(null);
        mylist.Traverse(mylist.getRoot());
        System.out.println("---------------");

        String stringData = "5 6 7 8 8 9 3 9";

        String[] data = stringData.split(" ");
        for (String s : data){
            mylist.addItem(new NOde(s));
        }

        System.out.println("=====================");

        mylist.Traverse(mylist.getRoot());
        mylist.removerItem(new NOde("5"));
        mylist.Traverse(mylist.getRoot());




    }












}
