package collectionFramework.iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IteratorImpl {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>();

        list.add(100);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);


        Iterator<Integer> it=list.iterator();

        while(it.hasNext()){
            int num=it.next();
            System.out.println(num);

        }


    }
}
