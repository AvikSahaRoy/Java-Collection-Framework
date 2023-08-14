import java.util.*;

class forEachLoop
{
	public static void main (String[] args)
	{
        ArrayList<String> names = new ArrayList<String>();
        
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");
        
        for(String name : names) {
            System.out.println(name);
        }
	}
}
// Output --
// Alice
// Bob
// Charlie
// Dave
