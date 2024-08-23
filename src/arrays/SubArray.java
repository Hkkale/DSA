package arrays;

import java.util.HashMap;
import java.util.Map;

public class SubArray {
    public static void main(String[] args) {
        int[] nums={10,5,2,7,1,9};
        int target=15;
        System.out.println(bruteforce(nums,target));

        System.out.println(better(nums,target));
        System.out.println(optimal(nums,target));

    }

    private static int optimal(int[] nums, int target) {
        

        int left=0;
        int right=0;
        long sum=nums[left];
        int maxLen=0;
        int n=nums.length;

        while (right<n){
            while (sum>target && left<=right){
                sum-=nums[left];
                left++;
            }
            if(sum==target){
                maxLen= Math.max(maxLen,(right-left)+1);
            }
            right++;
            if (right<n){
                sum+=nums[right];
            }
        }


        return maxLen;
    }

    private static int better(int[] a, int k) {
//        TC->O(n log n) SC-> O(n)

        int n = a.length; // size of the array.

        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            long rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }


    private static int bruteforce(int[] nums, int target) {

//        TC->O(N^2)  SC-> O(1)

        int length=0;

        for (int i = 0; i < nums.length; i++) {
            int sum=0;
            for (int j = i; j < nums.length; j++) {

                sum+=nums[j];

                if(sum==target){
                    length=Math.max(length,(j-i)+1);
                }




            }

        }

        return length;
    }
}
