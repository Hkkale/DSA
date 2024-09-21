package collectionFramework.set;

import java.util.HashSet;

public class HashSetImpl {
    public static void main(String[] args) {
//        hash set datastructures stores the values in random format and its does not allow duplicates
        HashSet<Integer> hs= new HashSet<>();

        hs.add(1);
        hs.add(0);
        hs.add(3);
        hs.add(2);
        hs.add(-1);
        System.out.println(hs);

        for(int num:hs){
            System.out.print(num+" ,");
        }
    }
}
