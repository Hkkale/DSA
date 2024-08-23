package arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0};
        int n= arr.length;

        System.out.println(missingNumber(arr,n));



    }

//    Optimal have 2 Approach Sum And XOR .... Sum TC->O(n)    SC->O(1)

    private static int  missingNumber(int[] arr, int n) {

//        int sumOfNaturalNum=(n*(n+1))/2;
//        int sum=0;
//
//        for(int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//
//        }
//        return sumOfNaturalNum-sum;



        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...N]

        return (xor1 ^ xor2);

    }


//    Better Approach TC->O(N+N)      SC->O(N)

//    private static int  missingNumber(int[] arr, int n) {
//
//      int [] hash = new int[n+1];
//
//        for (int i = 0; i < arr.length; i++) {
//
//            hash[arr[i]]=1;
//
//        }
//        for (int i = 1; i <hash.length; i++) {
//
//           if(hash[i]==0){
//               return i;
//           }
//
//        }
//      return -1;
//
//    }


//  Bruteforce TC->O(N*N)
//    private static int  missingNumber(int[] arr, int n) {
//
//        for (int i = 1; i <= n; i++) {
//            int flag=0;
//            for (int j = 0; j < n-1; j++) {
//                if(i==arr[j]){
//                    flag=1;
//                    break;
//                }
//
//
//            }
//            if(flag==0){
//                return i;
//            }
//
//        }
//
//
//        return -1;
//
//    }
}
