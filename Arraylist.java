import java.util.*;

class Arraylist {
    public static void main(String[] args) {
        // Initilize the ArrayList -----------
        ArrayList<String> a = new ArrayList<>();

        // Value add into ArrayList -----------
        a.add("Java");
        a.add("Py");
        a.add("HTML");
        System.out.println("ArrayList is: "+a);

        // Get the value particular index --------
        System.out.println("Get the value particular index: "+a.get(1));

        // Change the element into arrayList ------
        a.set(0, "C++");
        System.out.println("After change ArrayList: "+a);

        // Remove element into ArrayList ----------
        a.remove(1);
        System.out.println("After Remove element into ArrayList: "+a);

        // Remove All elements using removeAll() ---------
        //a.removeAll(a);
        //System.out.println("Remove All elements: "+a);

        // Clear all elements using clear() -------------
        //a.clear();
        //System.out.println("Clear all elements: "+a);

        // Create another arraylist 'b' and all the value add arraylist 'a' to arraylist 'b' ------
        ArrayList<String> b = new ArrayList<>();
        b.addAll(a);
        System.out.println("New arraylist b : "+b);

        // Clone() arraylist -----------
        System.out.println("Clone arraylist: "+b.clone());

        // Convert ArrayList to Array ----------
        String arr[] = new String[a.size()];
        a.toArray(arr);

        // Print the Array using for loop --------
        System.out.println("Print the arraylist using for loop -- ");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Print the arraylist using foreach loop -- ");
        // Print the Array using foreach loop --------
        for(String item:arr) {
            System.out.println(item);
        }

        // Convert Array to ArrayList ------------
        String ar[] = {"A", "B", "C"};
        ArrayList<String> ar1 = new ArrayList<>(Arrays.asList(ar));
        System.out.println("Convert Array to ArrayList: "+ar1);

        // Sort method in ArrayList -------
        ArrayList<Integer> num = new ArrayList<>();
        num.add(2);
        num.add(1);
        num.add(3);
        System.out.println("ArrayList is: "+num);
        Collections.sort(num);
        System.out.println("Sorted ArrayList is: "+num);

    }
}
