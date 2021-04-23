package example.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Locations> location = new HashMap<>();
        location.put(0, new Locations(0, "You are sitting in front of a computer learning Java"));
        location.put(1, new Locations(1, "You are standing at the end of a road before a small brick building"));
        location.put(2, new Locations(2, "You are at the top of a hill"));
        location.put(3, new Locations(3, "You are inside a building, a well house for a small spring"));
        location.put(4, new Locations(4, "You are in a valley beside a stream"));
        location.put(5, new Locations(5, "You are in the forest"));

        location.get(1).addExits("W",2);
        location.get(1).addExits("E",3);
        location.get(1).addExits("N",5);
        location.get(1).addExits("S",4);

        location.get(2).addExits("N",5);

        location.get(3).addExits("W",1);

        location.get(4).addExits("W",2);
        location.get(4).addExits("N",1);

        location.get(5).addExits("S",1);
        location.get(5).addExits("W",2);
        HashMap<String,String> vocabulary = new HashMap<>();
        vocabulary.put("QUITE","Q");
        vocabulary.put("NORTH","N");
        vocabulary.put("SOUTH","S");
        vocabulary.put("WEST","W");
        vocabulary.put("EAST","E");
        int loc = 1;
        while(true) {
            System.out.println(location.get(loc).getDescription());
            if(loc==0) {
                break;
            }
            Map<String,Integer> exits = location.get(loc).getExits();
            System.out.print("Available directions are   ");
            for(String exit : exits.keySet()){
                System.out.print(exit +", ");
            }
            System.out.println();
            String value = sc.nextLine().toUpperCase();
            if(value.length()>1) {
                String[] newValue = value.split(" ");
                for(String x : newValue) {
                    if(vocabulary.containsKey(x)) {
                        value = vocabulary.get(x);
                        break;
                    }
                }
            }
            if(exits.containsKey(value)) {
                loc = exits.get(value);
            } else {
                System.out.println("You can not go here");
            }

        }
    }
}
