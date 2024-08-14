package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]  arr={1000,3,1,2,4,5,25,47,71,41711,83,19,94,761,4431};
        int n= arr.length;
        mergeSort(arr,0,n-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr, int low, int high) {

        if(low==high){
            return;
        }

        int mid= (low+high)/2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);


    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp =new ArrayList<>();

        int left=low;
        int right= mid+1;

        while(left<=mid && right<=high ){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(arr[left]);
            left++;

        }
        while (right<=high){
            temp.add(arr[right]);
            right++;

        }

        for (int i = low; i <=high; i++) {
            arr[i]=temp.get(i-low);

        }
    }
}
