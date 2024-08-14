package arrays;

public class CheckIfSort {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,4,5};

        System.out.println(checkSorted(arr,arr.length));


    }

    private static boolean checkSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }

        }

        return true;
    }
}
