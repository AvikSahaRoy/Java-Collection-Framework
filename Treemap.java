import java.util.*;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<Integer,String>();

        map.put(1,"A");
        map.put(3,"B");
        map.put(2,"C");
        System.out.println("Iterating Hashmap...");
        for(Map.Entry m : map.entrySet())
        System.out.println(m.getKey()+" "+m.getValue());

        map.remove(3);
        System.out.println("===========After Removal==================");
        for(Map.Entry m : map.entrySet())
        System.out.println(m.getKey()+" "+m.getValue());
        
        map.replace(2, "Engineering");
        System.out.println("===========After Replace==================");
        for(Map.Entry m : map.entrySet())
        System.out.println(m.getKey()+" "+m.getValue());

    }
}
