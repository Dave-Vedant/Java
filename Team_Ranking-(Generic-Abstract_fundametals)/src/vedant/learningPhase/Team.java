package vedant.learningPhase;

import java.util.ArrayList;

public class Team {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<Player> member = new ArrayList<>();                       // its generic

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer (Player player) {
        if (member.contains(player)) {
            System.out.println(player + " is already in the member list");
            return false;
        } else {
            member.add(player);
            System.out.println(player + " is added in the member list");
            return true;
        }
    }

    public int numPlayer(){
        return this.member.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore){
        if(ourScore>theirScore){
            won++;
        } else if (ourScore == theirScore){
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null,theirScore, ourScore);       //update opponents score...
        }
    }

    public int ranking(){
        int points = (2* won) + tied;
        return points;
    }
}
