package vedant.learningPhase;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int LocationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description) {
        LocationID = locationID;
        this.description = description;
        this.exits = new HashMap<String,Integer>();
        this.exits.put("Q",0);
    }

    public void addExit(String direction, int location){
        exits.put(direction,location);
    }

    public int getLocationID() {
        return LocationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
