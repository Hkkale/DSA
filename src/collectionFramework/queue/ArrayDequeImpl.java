package collectionFramework.queue;

import java.util.ArrayDeque;

public class ArrayDequeImpl {
    public static void main(String[] args) {
//        Arraydeque is ds that uses FIFO(First In First Out) it also add elements from both sides

        ArrayDeque<Integer> ad=new ArrayDeque<>();


        ad.offer(1);
        ad.offer(2);
        ad.offer(3);
        ad.offer(4);
        ad.offer(5);
        ad.offer(6);
        ad.offer(7);
        System.out.println(ad);

        System.out.println(ad.peek());
        System.out.println(ad.poll());
        System.out.println(ad);
        ad.offerFirst(100);
        System.out.println(ad);

    }
}
