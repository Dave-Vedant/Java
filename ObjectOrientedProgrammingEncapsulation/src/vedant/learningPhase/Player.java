package vedant.learningPhase;

public class Player {
    // public String name;  // now let change the variable name==> newName, its hard to change across all program in long coding
    public String newName;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = health - damage;
        if(this.health<0){
            System.out.println("Player kicked out");
        }
    }
    public int healthRemaining(){
        return this.health;
    }
}
