package hashing;

import java.util.Scanner;

public class FrequencyElements {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);


        int[] arr = {1, 3, 4, 5, 8, 9,1,1,1,1,1,1,9,9,9,9};


    //    Only used when we know elements of array just because we need highest element of array to precompute

        int[] hash = new int[10];

        for (int i = 0; i < arr.length ; i++) {
            hash[arr[i]]++;

        }

        int q= sc.nextInt();

        while(q-- != 0){
            int num= sc.nextInt();

            System.out.println("frequency of element "+num+"in array is"+hash[num]);
        }


    }

}
