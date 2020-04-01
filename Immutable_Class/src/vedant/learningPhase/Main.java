package vedant.learningPhase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> location = new HashMap<Integer,Location>();

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> tempExit = new HashMap<String, Integer>();
        location.put(0,new Location(0, "Toronto",tempExit));

        tempExit.put("W",2);
        location.put(1,new Location(1, "Scarborough",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("N", 2);
        tempExit.put("W", 3);
        tempExit.put("S", 4);
//      tempExit.put(1).addExit("Q", 0);
        location.put(2,new Location(2, "North york",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("E", 3);
        tempExit.put("S", 4);
        tempExit.put("N", 1);
//        tempExit.put(1).addExit("Q", 0);
        location.put(3,new Location(3, "Brampton",tempExit));

        tempExit = new HashMap<String, Integer>();
        tempExit.put("S", 4);
        tempExit.put("E", 1);
        tempExit.put("W", 2);
//        tempExit.put(1).addExit("Q", 0);
        location.put(4,new Location(4, "Mississauga",tempExit));

        tempExit = new HashMap<String,Integer>();
        tempExit.put("S", 3);
        tempExit.put("E", 3);
        tempExit.put("W", 3);
//        tempExit.put(1).addExit("Q", 0);
        location.put(5,new Location(5, "Windsor",tempExit));

        Map<String,String> actionDirectory = new HashMap<String,String>();
        actionDirectory.put("NORTH","N");
        actionDirectory.put("SOUTH","S");
        actionDirectory.put("EAST","E");
        actionDirectory.put("WEST","W");
        actionDirectory.put("QUIT","Q");


        int loc =1;
        while(true){
            System.out.println(location.get(loc).getDescription());
            tempExit.remove("S");                                             // after change in structure of Location now any change in main will not affect our Location class
            if (loc==0){                                                     // ... and we can allow change in main class ,
                break;
            }
            Map<String,Integer> exits = location.get(loc).getExits();
            System.out.println("The available exits are : ");
            for(String exit: exits.keySet()){
                System.out.print(exit + "|");
            }
            System.out.println("");

            String direction = scanner.nextLine().toUpperCase();
            if(direction.length() > 1){
                String[] words = direction.split(" ");
                for(String word : words){
                    if(actionDirectory.containsKey(word)){
                        direction = actionDirectory.get(word);
                        break;
                    }
                }
            }

            if(exits.containsKey(direction)){
                loc = exits.get(direction);
                System.out.println("You move to " + direction);
            } else {
                System.out.println("You can not go in that direction.");
                System.out.println("You current place is as follow:");
            }

//            loc = scanner.nextInt();
//            if(!location.containsKey(loc)){
//                System.out.println("You can not go in that direction.");
//            }
        }



    }
}
