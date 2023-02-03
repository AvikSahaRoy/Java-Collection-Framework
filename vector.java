import java.util.Vector;

class vector {
    public static void main(String[] args) {
        // Initilize the Vector ------
        Vector<String> list = new Vector<String>();

        // Add value into vector --------
        list.add("Cow");
        list.add("Cat.");
        list.add("Dog");
        System.out.println(list);

        // Clear the Vector ----------
        list.clear();
        System.out.println(list);

    }
}
