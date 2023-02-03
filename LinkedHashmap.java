import java.util.*;

class LinkedHashmap {
    public static void main(String[] args) {
        // Innitilize LinkedHashMap ----------
        LinkedHashMap<Integer,String>map = new LinkedHashMap<Integer,String>();

        // Add values -----------
        map.put(1,"A");
        map.put(3,"B");
        map.put(2,"C");
        System.out.println("Iterating LinkedHashmap...");
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
