package vedant.learningPhase;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player vedant = new Player("vedant", 10, 100);
        System.out.println(vedant.toString());
        saveObject(vedant);
        System.out.println("=====");

        vedant.setHitPoints(9);
        System.out.println(vedant);
        vedant.setWeapon("Laser gun");
        saveObject(vedant);
        System.out.println("========");
 //       loadObject(vedant);
        System.out.println("========");
        System.out.println(vedant);

        System.out.println("+=+=+=+=+=+=+=+=+=");
        ISaveable wareWolf = new Monster("JiJi", 20,20);             // see: its like List<String> name = new ArrayList<String>(); so same library structure we have;
        System.out.println(wareWolf);
        saveObject(wareWolf);
    }

// use read value method instead of java predefined i/o functions...
    private static ArrayList<String> readValues(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;

        System.out.println("Choose \n" +
                "1 = to enter a string\n" +
                "0 = to  quit");

        while(!quit){
            System.out.println("Choose an options");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a String: " );
                    String StringInput = scanner.nextLine();
                    values.add(index, StringInput);
                    index++;                                     // *ERROR SOLVED: WOW, WITHOUT INCREMENT CODE READ INPUT IN REVERSE ORDER BY PUSHING EACH VALUE TO NEXT INDEX ( A= N --> B=N THEN A =N+1) IN INDEX POSITION.
                    break;
            }
        }
        return values;
    }

    // make supportive methods to link up (main links to classes)
    public static void saveObject(ISaveable objectToSave){
        for(int i = 0; i< objectToSave.write().size(); i++){
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
        System.out.println("Load object done");
    }
}
