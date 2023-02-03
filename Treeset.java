import java.util.*;

class Treeset {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();  
        set.add("One");    
        set.add("Three");    
        set.add("Two");   
        set.add("Four");  
        set.add("Four");  
        Iterator<String> i=set.iterator();  
        while(i.hasNext())  
        System.out.println(i.next());  

        set.remove("One");
        System.out.println("------------------------------");
        Iterator<String> i1=set.iterator(); 
        while(i1.hasNext())  
            System.out.println(i1.next());  

    }
}
