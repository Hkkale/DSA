package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={3,2,4};
        int target=6;

        System.out.println(Arrays.toString(bruteforce(arr,target)));
        System.out.println(Arrays.toString(better(arr,target)));
        System.out.println(Arrays.toString(optimal(arr,target)));
    }

    private static int[] optimal(int[] arr, int target) {
//        TC->O(n* log n)  SC->(1) but not work if we want index
        int n= arr.length;
        int i=0;
        int j=n-1;

        Arrays.sort(arr);

        while (i<j){
            if(arr[i]+arr[j]==target){
                return new int[]{i,j};

            }
            else if ((arr[i]+arr[j])>target ){
                j--;

            }
            else{
                i++;
            }
        }

        return new int[]{-1,-1};


    }

    private static int[] better(int[] arr, int target) {
//        TC->O(N* log n) SC->O(N)
        Map<Integer,Integer> map = new HashMap<>();



        for (int i = 0; i < arr.length; i++) {

            int rem= target-arr[i];

            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i],i);



        }
        return new int[]{-1,-1};
    }

    private static int[] bruteforce(int[] arr, int target) {
//        TC->O(n^2) sc->O(2)
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {

                if(arr[i]+arr[j]==target){
                    return new int[]{i,j};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
