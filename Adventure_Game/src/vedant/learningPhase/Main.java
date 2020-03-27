package vedant.learningPhase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> location = new HashMap<Integer,Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        location.put(0,new Location(0, "Toronto"));
        location.put(1,new Location(1, "Scarborough"));
        location.put(2,new Location(2, "North york"));
        location.put(3,new Location(3, "Brampton"));
        location.put(4,new Location(4, "Mississauga"));
        location.put(5,new Location(5, "Windsor"));

        location.get(1).addExit("N", 2);
        location.get(1).addExit("W", 3);
        location.get(1).addExit("S", 4);
//        location.get(1).addExit("Q", 0);
        location.get(2).addExit("E", 3);
        location.get(2).addExit("S", 4);
        location.get(2).addExit("N", 1);
//        location.get(1).addExit("Q", 0);
        location.get(3).addExit("S", 4);
        location.get(3).addExit("E", 1);
        location.get(3).addExit("W", 2);
//        location.get(1).addExit("Q", 0);
        location.get(4).addExit("S", 3);
        location.get(4).addExit("E", 3);
        location.get(4).addExit("W", 3);
//        location.get(1).addExit("Q", 0);

        Map<String,String> actionDirectory = new HashMap<String,String>();
        actionDirectory.put("NORTH","N");
        actionDirectory.put("SOUTH","S");
        actionDirectory.put("EAST","E");
        actionDirectory.put("WEST","W");
        actionDirectory.put("QUIT","Q");


        int loc =1;
        while(true){
            System.out.println(location.get(loc).getDescription());
            if (loc==0){
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
