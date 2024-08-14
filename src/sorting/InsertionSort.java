package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[]  arr={3,1,2,4,5,25,47,71,41711,83,19,94,761,4431};

        insertionSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int n) {
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]= temp;

                j--;
            }
        }
    }
}
