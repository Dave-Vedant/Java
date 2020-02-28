package vedant.learningPhase;

public class EnhancedPlayer {
    private String name;
    private int hitPoint = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;

        if ((health > 0) && (health <= 100)) {
            this.hitPoint = health;
        }

        this.weapon = weapon;
    }


    public void loseHealth (int damage){
        this.hitPoint = hitPoint - damage;
        if (this.hitPoint < 0) {
            System.out.println("Player kicked out");
        }
    }
        //getter...
    public int getHealth() {                        // cool... we changed health to hitPoint, but getHealth() does not change and not error...
        return hitPoint;
    }
}