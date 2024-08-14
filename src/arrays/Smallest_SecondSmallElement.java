package arrays;

import java.util.Arrays;

public class Smallest_SecondSmallElement {
    
    
        public static void main(String[] args) {
            int[] arr = {10,2,5,8,1,2,7};

//        Bruteforce Approach time complexity-> O(N log N + N)

            Arrays.sort(arr);
            int n=arr.length;
            int smallest=arr[0];
            int secondSmallest=Integer.MAX_VALUE;

            for (int i = 1; i <n; i++) {
                if(arr[i]<secondSmallest && arr[i]!=smallest){
                    secondSmallest=arr[i];
                }

            }
            System.out.println(smallest);
            System.out.println(secondSmallest);




//        Better Approach time complexity-> O(N + N) = (2N)

            smallest=arr[0];
            secondSmallest=Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                if(arr[i]<smallest){
                    smallest=arr[i];
                }

            }
            for (int i = 0; i < n; i++) {
                if(arr[i]<secondSmallest && arr[i]!=smallest){
                    secondSmallest=arr[i];
                }

            }
            System.out.println(smallest);
            System.out.println(secondSmallest);



//        Optimal Approach time complexity-> O(N);

            smallest=arr[0];
            secondSmallest=Integer.MAX_VALUE;


            for (int i = 1; i < n ; i++) {
                if(arr[i]<smallest){
                    secondSmallest=smallest;
                    smallest=arr[i];

                }
                else if(arr[i]>smallest &&  arr[i]<secondSmallest){
                    secondSmallest=arr[i];
                }

            }
            System.out.println(smallest);

            System.out.println(secondSmallest);


        }
    }



