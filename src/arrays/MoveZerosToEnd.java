package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int [] arr= {1,0,2,3,0,5,0};


//        Optimal Tc->O(X) + O(N-X)= O(N)   SC-->O(1)
        int j=-1;

        for(int i = 0; i <arr.length; i++) {

            if(arr[i]==0){
                j=i;
                break;
            }
        }
        for(int i = j+1; i <arr.length; i++) {

            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));








//        BruteForce Tc->O(2N) SC->O(N)

        ArrayList<Integer> temp=new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                temp.add(arr[i]);

            }

        }

        for (int i = 0; i < temp.size(); i++) {
            arr[i]=temp.get(i);

        }

        for (int i = temp.size(); i < arr.length; i++) {
            arr[i]=0;

        }


        System.out.println(Arrays.toString(arr));
    }
}
