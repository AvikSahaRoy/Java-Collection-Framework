import java.util.LinkedList;

class LinkedList {
    public static void main(String[] args) {
        // Initilize the LinkedList -----------
        LinkedList<String> list = new LinkedList<>();

        // Add value into LinkedList ----------
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
