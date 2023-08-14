// Iterator ----------------------------------------
import java.util.*;

class Iterator
{
	public static void main (String[] args)
	{
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        
        Iterator<String> iterator = names.iterator();
        
        while(iterator.hasNext()) {
            System.out.println(iterator.next()); // John Jane Bob
        }
	}
}
// ------------------------------------------------------------------------------
// ListIterator----------------
import java.util.*;

class ListIterator
{
	public static void main (String[] args)
	{
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        
        ListIterator<String> iterator = myList.listIterator();
        
        while(iterator.hasNext()) {
            String fruit = iterator.next();
            if(fruit.equals("Banana")) {
                iterator.remove();
            }
            if(fruit.equals("Orange")) {
                iterator.add("Grapefruit");
            }
            if(fruit.equals("Apple")) {
                iterator.set("Pear");
            }
        }
        
        while(iterator.hasPrevious()) {
            String fruit = iterator.previous();
            System.out.println(fruit);
        }
        
        iterator.add("Mango");
        
        System.out.println(myList);
	}
}
