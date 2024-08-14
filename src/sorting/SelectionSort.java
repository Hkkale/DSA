package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]  arr={1, 20,40,50,-20,-88,0, 3, 5, 4};

        selectionSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr, int n) {

        for (int i = 0; i <n-1 ; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
}

