package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[]  arr={1,2,3,4,5,6};

        bubbleSort(arr,arr.length);

        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {


        boolean swapped=false;

        for (int i = 0; i <n-1 ; i++) {
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    swapped=true;
                    System.out.println("swappped");
                }
            }


            if(!swapped){
                break;
            }


        }
    }
}
