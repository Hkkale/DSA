package arrays;

import java.util.Arrays;

public class LeftRotateByOnePlace {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};

        lefRotate(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void lefRotate(int[] arr) {

        int temp=arr[0];
        int n=arr.length;
        for (int i = 1; i < n; i++) {
            arr[i-1]=arr[i];

        }
        arr[n-1]=temp;
    }
}
