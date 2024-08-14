package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {

    public static void main(String[] args) {
        int[] arr={10,50,7,8,45,96,17,154,149,15,6,82,92,93,9};
        recursiveInsertionSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void recursiveInsertionSort(int[] arr,int i, int n) {
        if(i==n){
            return;
        }

        int j=i;

        while(j>0 && arr[j]<arr[j-1]){
            int temp=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=temp;
            j--;






        }

        recursiveInsertionSort(arr,i+1, n);
    }
}
