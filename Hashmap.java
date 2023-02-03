import java.util.*;

class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<>();

        h.put(1, "A");
        h.put(2, "B");
        h.put(3, "C");

        System.out.println("HashMap is: "+h);
        System.out.println("Keys: "+h.keySet()); 
        System.out.println("Values: "+h.values()); 
        System.out.println("Key/Value Mapping: "+h.entrySet());
    }
}
