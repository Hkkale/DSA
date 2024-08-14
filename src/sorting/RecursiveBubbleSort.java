package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int[] arr={10,50,7,8,45,96,17,154,149,15,6,82,92,93,9};
        recursiveBubbleSort(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveBubbleSort(int[] arr, int n) {
        if(n==1){
            return;
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        recursiveBubbleSort(arr,n-1);
    }
}
