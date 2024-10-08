package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class basicStreams {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(7,5,8,6,4,12,8,6,9);

//        nums.forEach(System.out::println);


//        Stream<Integer> s1 = nums.stream();
//
//       Stream<Integer> s2= s1.filter(n -> n%2==0);
//
//        Stream<Integer> s3= s2.map(n->n*10);
//
//        int sum = s3.reduce(0,(c,e)->c+e);

//       s3.forEach(n -> System.out.println(n));

        int sum= nums.stream()
                        .filter(n->n%2==0)
                        .map(n->n*10)
                        .reduce(0,(c,e)->c+e);



        System.out.println(sum);


    }
}
