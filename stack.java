import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        // Initilize the vector --------
        Stack<String> list = new Stack<String>();

        // Add value into vector ----------
        list.add("Cow");
        list.add("Cat");
        list.add("Dog");
        System.out.println(list);

        // pop the last element in stack ---------
        list.pop();
        System.out.println(list);

        // fetch the top element of the stack -----------
        System.out.println(list.peek());

    }
}
