package arrays;

import java.util.ArrayList;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,2,3,3,4,5,6};
        int[] arr2={2,3,3,5,6,6,7};

        System.out.println(findIntersection(arr1,arr2, arr1.length,arr2.length));
    }


//    Optimal approach TC->O(N+M) SC->O(X)

    private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n, int m) {

        ArrayList<Integer> intersection= new ArrayList<>();

        int i=0;
        int j=0;

        while (i<n && j<m){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr2[j]<arr1[i]){
                j++;
            }
            else{
                intersection.add(arr1[i]);
                i++;
                j++;
            }
        }

        return intersection;
    }









//    Bruteforce TC-O(N*M) SC->(M*M)
//    private static ArrayList<Integer> findIntersection(int[] arr1, int[] arr2, int n, int m) {
//
//        ArrayList<Integer> intersection = new ArrayList<>();
//        int[] visitedArr=new int[m];
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if(arr1[i]==arr2[j] && visitedArr[j]==0){
//                    intersection.add(arr2[j]);
//                    visitedArr[j]=1;
//                    break;
//                }
//
//
//                if(arr2[j]>arr1[i]){
//                    break;
//                }
//
//            }
//
//        }
//
//        return intersection;
//    }
}
