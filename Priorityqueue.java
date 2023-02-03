import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        // Initilize the Priorityqueue ------------
        PriorityQueue<String> queue = new PriorityQueue<>();

        // Add values into the queue ---------------- 
        queue.add("A");
        queue.add("B");
        queue.add("C");
        System.out.println(queue);

        // show the head of the queue --------------
        System.out.println(queue.element());
        System.out.println(queue.peek());

        // remove the head of the quque ----------
        queue.remove();  
        queue.poll();  
        System.out.println(queue);

    }
}
