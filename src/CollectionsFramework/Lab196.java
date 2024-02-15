package CollectionsFramework;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab196 {
    public static void main(String[] args) {
        Queue pq = new PriorityQueue();
        pq.offer(10);
        pq.offer(20);
        pq.offer(30);
        pq.offer(40);
        pq.offer(50);

        System.out.println(pq);

        Iterator it = pq.iterator();
        while (it.hasNext()){
            System.out.println(it.next()+ " ");
        }
    }
}
