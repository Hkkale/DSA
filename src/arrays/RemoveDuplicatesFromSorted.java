package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = {-3,-1,0,0,0,3,3};

        int k = removeDuplicates(arr);
        System.out.println(k);
        System.out.println(Arrays.toString(arr));

    }



//    Bruteforce Approach time complexity->O(N Log N + N)  space->O(N);
//    private static int removeDuplicates(int[] arr) {
//
//        Set<Integer> set = new HashSet<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            set.add(arr[i]);
//
//        }
//
//        int j=0;
//        for (int x: set){
//            arr[j++]=x;
//
//        }
//
//        return set.size();
//    }


//    Optimal Approach time complexity-> O(N)   space complexity->O(1)



    private static int removeDuplicates(int[] arr) {

        int i=0;

        for (int j = 1; j < arr.length; j++) {
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }

        }
        int sizeOfArr=i+1;

        return sizeOfArr;
    }



}
