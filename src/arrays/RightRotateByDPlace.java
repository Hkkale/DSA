package arrays;

import java.util.Arrays;


public class RightRotateByDPlace {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int d=2;

        rightRotateByDplaceReverse(nums,d);

//        rightRotateByDplace(nums,d);
        System.out.println(Arrays.toString(nums));




    }

//    Optimal Approach TC->O(N) SC->O(1)

    private static void rightRotateByDplaceReverse(int[] nums, int d) {

        int n=nums.length;

        reverse(nums,0,n-d-1);
        reverse(nums,n-d,n-1);
        reverse(nums,0,n-1);


    }

    public static void reverse(int[] arr, int start, int end){

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }






















//    BruteForce approach TC->O(n+d) SC->O(d)

    private static void rightRotateByDplace(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;

        int[] temp = new int[k];

        int j=k-1;
        for(int i=n-1;i>=(nums.length-k);i--){
            temp[j--]=nums[i];

        }


        for(int i=n-k-1;i>=0;i--){
            nums[i+k]=nums[i];
        }
        System.out.println(Arrays.toString(temp));

        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }





    }


    }

