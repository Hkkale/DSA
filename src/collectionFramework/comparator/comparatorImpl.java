package collectionFramework.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorImpl {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();


        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

//      Sort  the list in descending order
//        num2-num1 return 1 if num2>num1  returning 1 means swap , -1 means no swap , 0 means they are equal
        list.sort((num1,num2)->num2-num1);



        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
