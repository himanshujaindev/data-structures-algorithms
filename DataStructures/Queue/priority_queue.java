package DataStructures.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

/*
Reference: https://www.geeksforgeeks.org/priority-queue-class-in-java/
*/

public class priority_queue {
    public static void main(String[] args) {
        Queue<Character> pq = new PriorityQueue<>();
        pq.add('a');
        pq.add('o');
        pq.add('e');

        // ['a', 'e', 'o'] - Default priority = Min ascii value

        System.out.println(pq.toString());

        // Printing the top element of
        // the PriorityQueue
        System.out.println(pq.peek());
  
        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());
  
        // Printing the top element again
        System.out.println(pq.peek());

    }
}
