package example.collection;

import java.util.HashMap;
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
        int loc = 1;
        while(true) {
            System.out.println(location.get(loc).getDescription());
            if(loc==0) {
                break;
            }
            loc = sc.nextInt();
            if(!location.containsKey(loc)) {
                System.out.println("You can not go in this direction");
            }
        }
    }
}
