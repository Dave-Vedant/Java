package vedant.learningPhase;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String Weapon;

    public Player(String name, int hitPoints, int strength){
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.Weapon  = "Sward";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getWeapon() {
        return Weapon;
    }

    public void setWeapon(String weapon) {
        this.Weapon = weapon;
    }

    @Override
    public String toString() {
        return "Players{" +
                "Name: " + name +
                ", hitPoint: " + hitPoints +
                ", Strength: " + strength +
                ", Weapon: " + Weapon + "}";
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<String>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2,"" + this.strength);
        values.add(3, this.Weapon);

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.hitPoints = Integer.parseInt(savedValues.get(1));
            this.strength = Integer.parseInt(savedValues.get(2));
            this.Weapon = savedValues.get(3);

    }
}
}
