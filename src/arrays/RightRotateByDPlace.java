package arrays;

import java.util.Arrays;

public class RightRotateByDPlace {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int d=3;

        rightRotateByDplace(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateByDplace(int[] arr, int k) {
        k=k%arr.length;

        int [] temp= new int[k];

        int j=0;

        for (int i = k; i < arr.length; i++) {
            temp[j++]=arr[i];
        }

        for (int i = k; i >=0; i--) {
            arr[i+k]=arr[i];

        }
//        for (int i = arr.length-d; i<arr.length; i++) {
//            arr[i]=arrD[i-(arr.length-d)];
//
//        }



    }
    }

