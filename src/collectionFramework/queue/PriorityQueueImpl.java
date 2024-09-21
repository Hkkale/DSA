package collectionFramework.queue;

import java.util.PriorityQueue;

public class PriorityQueueImpl {
    public static void main(String[] args) {
//        priorityqueue ds stores elements and whenever we peek() the element it gives low priority number
//        that is nothing but smallest number in queue
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(1);
        pq.offer(0);
        pq.offer(2);
        pq.offer(-1);
        System.out.println(pq);

        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);




    }
}
