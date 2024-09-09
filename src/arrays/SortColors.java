package arrays;

import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr={1,0,2,1,0,1,2,2,0,1,1,0,2,0,1};
        brutforce(arr);

        System.out.println(Arrays.toString(arr));


    }

    private static void brutforce(int[] arr) {

        int count0=0;
        int count1=0;
        int count2=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0) count0++;

            else if (arr[i]==1) count1++;

            else count2++;


        }
        for (int i = 0; i <count0 ; i++) arr[i]=0;
        for (int i = count0; i < count0+count1 ; i++) arr[i]=1;
        for (int i = count1+count0; i < arr.length; i++) arr[i]=2;

    }
}
