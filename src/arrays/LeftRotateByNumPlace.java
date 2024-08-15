package arrays;

import java.util.Arrays;

public class LeftRotateByNumPlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=2;

        leftRotateByDplace(arr,d);
        System.out.println(Arrays.toString(arr));
    }
//    Bruteforce approach
    private static void leftRotateByDplace(int[] arr,int d) {
        d=d%arr.length;

        int [] arrD= new int[d];

        for (int i = 0; i < d; i++) {
            arrD[i]=arr[i];
        }

        for (int i = d; i < arr.length; i++) {
            arr[i-d]=arr[i];

        }
        for (int i = arr.length-d; i<arr.length; i++) {
            arr[i]=arrD[i-(arr.length-d)];

        }



    }
}
