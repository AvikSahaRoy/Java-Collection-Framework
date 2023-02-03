import java.util.ArrayDeque;

public class Arraydeque {
    public static void main(String[] args) {
        // Initilize the ArrayDeque --------
        ArrayDeque<String> deque = new ArrayDeque<String>();  

        // Add value into ArrayDeque ------------
        deque.add("A"); 
        deque.add("B");
        System.out.println("ArrayDeque is: "+deque);

        // add value ends --------
        deque.offer("C");     
        System.out.println("Insert last: "+deque); 

        // insert the value first ------
        deque.offerFirst("D");
        System.out.println("Insert First: "+deque); 
        
        // Remove first ----------
        deque.poll();
        System.out.println("Remove first: "+deque);
        
        // Remove last --------- 
        deque.pollLast();
        System.out.println("Remove last: "+deque);
     
    }
}
