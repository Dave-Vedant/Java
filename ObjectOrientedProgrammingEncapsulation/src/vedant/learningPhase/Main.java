package vedant.learningPhase;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // CASE 1... WITHOUT ENCAPSULATION
        Player player = new Player();
        //  player.name = "Trump"; change parameter  from name ==> NewName , so it show error, to avoid it use encapsulation...
        player.health =100;
        player.weapon = "kar-92";

        int damage = 30;
        player.loseHealth(damage);
        System.out.println("The remaining health is "+ player.healthRemaining());

        damage = 80;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health is "+ player.healthRemaining());

        // CASE 2 : Encapsulation.....
        System.out.println("================");
        EnhancedPlayer player1 = new EnhancedPlayer("Obama",290,"AK 47");
        System.out.println("Initial health is " + player1.getHealth());

        /*
        HERE,  [1] in first code "if we change name in some class then we need to change it in main or any other class
        too" , but if we use encapsulation, then we do not need to write the parameter name in main reason is the parameter are
        private in encapsulation and just need to put value in structure way,,
                ... NOTE: we must change name in own class by ... right click -- refactor -- rename ... will change name in whole class...

        [2] Other noticeable thing is about the access of parameter which is done by getter ==> such as getHealth() usage.

        .... Encapsulation other feature is in EnhancedPlayer class file, where after change "health ==> hitPoint", we can not
        see any change in getHealth() and program can not give any error and we do not need to change main code, where getHealth
        was used.  ...
         */

    }
}
