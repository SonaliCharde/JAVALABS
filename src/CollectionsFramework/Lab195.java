package CollectionsFramework;

import java.util.PriorityQueue;

public class Lab195 {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.add(32);
        priorityQueue.offer(23);
        priorityQueue.offer(98);
        priorityQueue.offer(54);

        System.out.println(priorityQueue);
    }
}
