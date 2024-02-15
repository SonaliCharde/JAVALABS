package CollectionsFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab194 {
    public static void main(String[] args) {
        Queue priorityQueue = new PriorityQueue();

        // FIFO -> 1 -> BOARD THE PLANE, Train
        // A, B, C -> A, B, c

        // Offer - Add
        // PQ  -> Sorted

       // priorityQueue.offer(87);
        priorityQueue.offer(88);
        priorityQueue.offer(21);
        priorityQueue.offer(22);
        //priorityQueue.offer(null); Queue cannot add null values

        priorityQueue.add(90);

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.peek()); //first 20 will be removed
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.peek());


    }
}
