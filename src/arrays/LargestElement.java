package arrays;

import java.util.Arrays;

public class LargestElement {

    public static void main(String[] args) {
        int[] arr= {10,20,3,40,105,50,70,88,90,95};

//        BruteForce approach time complexity->(N logN)

        Arrays.sort(arr);
        int largest=arr[arr.length-1];
        System.out.println(largest);


//        Optimal Approach time complexity-> O(N)

        largest=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }

        }

        System.out.println(largest);



    }
}
