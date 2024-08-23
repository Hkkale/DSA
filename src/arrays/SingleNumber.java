package arrays;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr ={1,2,1,3,4,4,5,3,5};

        System.out.println(findSingleNumber(arr));
    }

    private static int findSingleNumber(int[] arr) {

        int xor=0;

        for(int i=0;i<arr.length;i++){
            xor= xor ^ arr[i];
        }

        return xor;
    }
}
