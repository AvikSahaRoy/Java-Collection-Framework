import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        // Initilize the HashSet ----------
        HashSet<String> set = new HashSet<>();  

        // Add values into HashSet ------------
        set.add("One");    
        set.add("Two");    
        set.add("Three");   
        set.add("Four");  
        set.add("Four"); 

        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        System.out.println(i.next());  

        System.out.println("------------------------------");
        System.out.println(set);

        // Remove value into HashSet ------
        set.remove("One");
        System.out.println("------------------------------");
        Iterator<String> i1=set.iterator(); 
        while(i1.hasNext())  
            System.out.println(i1.next());  

    }
}
