package arrays;

import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {10,35,1,20,30,1};

//        Bruteforce Approach time complexity-> O(N log N + N)

        Arrays.sort(arr);
        int n=arr.length;
        int largest=arr[n-1];
        int secondLargest=-1;

        for (int i = n-2; i >=0; i--) {
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);




//        Better Approach time complexity-> O(N + N) = (2N)

        largest=arr[0];
        secondLargest=-1;

        for (int i = 0; i < n; i++) {
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if(arr[i]>secondLargest && arr[i]!=largest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);



//        Optimal Approach time complexity-> O(N);

         largest=arr[0];
        secondLargest=-1;


        for (int i = 0; i < n ; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];

            }
            else if(arr[i]<largest &&  arr[i]>secondLargest){
                secondLargest=arr[i];
            }

        }

        System.out.println(secondLargest);


    }
}
