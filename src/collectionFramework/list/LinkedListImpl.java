package collectionFramework.list;

import java.util.LinkedList;

public class LinkedListImpl {
    public static void main(String[] args) {
//        LinkedList datastructures allow elements to add in both the ends
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.addFirst(3);
        list.addLast(4);



        for (int a: list) {
            System.out.println(a*a);

        }

        System.out.println(list);
        System.out.println(list.get(0));
    }
}
