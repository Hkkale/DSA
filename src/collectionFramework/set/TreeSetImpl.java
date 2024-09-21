package collectionFramework.set;

import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args) {
//        tree set datastructures store the value in sorted format and its does not allow duplicates values
        TreeSet<Integer> ts= new TreeSet<>();

        ts.add(1);
        ts.add(0);
        ts.add(-1);
        ts.add(3);
        ts.add(2);

        System.out.println(ts);

    }
}
