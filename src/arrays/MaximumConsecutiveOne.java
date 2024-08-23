package arrays;

public class MaximumConsecutiveOne {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1,0,1,1,1,1};


        System.out.println(maximumConsecutive(arr));

    }

    private static int maximumConsecutive(int[] arr) {

        int counter=0;
        int max=0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]==1){
                counter++;
                max=Math.max(counter,max);
            }
            else {
                counter=0;
            }

        }
        return max;
    }

}
