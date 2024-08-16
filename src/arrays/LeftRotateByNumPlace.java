package arrays;

import java.util.Arrays;

public class LeftRotateByNumPlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;

//        leftRotateByDplace(arr,d);
//        System.out.println(Arrays.toString(arr));

        leftRotateReverse(arr,d);
        System.out.println(Arrays.toString(arr));

    }
//    Bruteforce approach time complexity->O(N+d) space complexity ->O(d)
    private static void leftRotateByDplace(int[] arr,int d) {
        d = d % arr.length;

        int[] temp = new int[d];


        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i-d] = arr[i];
        }
        int j=0;

        for (int i = arr.length-d; i < arr.length; i++) {
            arr[i]=temp[j++];
        }

    }

//    Optimal Approach time complexity ->O(N) space complexity->O(1)

    public static void leftRotateReverse(int[] arr, int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    private static void reverse(int[] arr, int start, int end) {

        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
