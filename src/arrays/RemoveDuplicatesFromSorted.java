package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr={1,1,2,3,4,4,5,6,6};

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);

        }

       int j=0;
       int k=set.size();

       for (int x:set){
           arr[j++]=x;
       }

        System.out.println(k);
        System.out.println(Arrays.toString(arr));


    }



}
