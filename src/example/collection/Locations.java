package example.collection;

import java.util.HashMap;

public class Locations {
    private final String description;
    private final int locationId;
    HashMap<String,Integer> exits;
    public Locations(int locationId ,String description) {
        this.description = description;
        this.locationId = locationId;
        this.exits = new HashMap<>();
        this.exits.put("Q",0);
    }
    public void addExits(String direction, int location) {
        exits.put(direction,location);
    }
    public int getLocationId() {
        return locationId;
    }
    public String getDescription() {
        return description;
    }

    public HashMap<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
