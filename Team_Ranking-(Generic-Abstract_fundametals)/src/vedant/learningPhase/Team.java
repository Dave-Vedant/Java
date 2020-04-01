package vedant.learningPhase;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>{              // <> show type, one kind of custom class in package
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> member = new ArrayList<>();                       // its generic

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (T player) {                  // public boolean addPlayer(Player player)
        if (member.contains(player)) {
            System.out.println(((Player) player).getName() + " is already in the member list");    //after doing T instead of Player, we need to give it direction so change it
            return false;
        } else {
            member.add(player);
            System.out.println(((Player)player).getName() + " is added in the member list");    //instead of player.name we need to give a separate direction.
            return true;
        }
    }

    public int numPlayer(){
        return this.member.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){   // here define Team<T> give power to compare teams for specific type of game only, such as football to football for state team and other with same name will not make conflict,
        String message;

        if(ourScore>theirScore){
            won++;
            message = " beat ";
        } else if (ourScore == theirScore){
            tied++;
            message = " tied with ";
        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null){
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null,theirScore, ourScore);       //update opponents score...
        }
    }

    public int ranking(){
        int points = (2 * won) + tied;
        System.out.println(this.getName() + " has " + points);
        return points;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking()>team.ranking()){
            return 1;
        } else if (this.ranking()<team.ranking()){
            return -1;
        } else {
        return 0;
    }
    }
}
