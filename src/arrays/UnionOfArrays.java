package arrays;
import  java.util.*;

public class UnionOfArrays {

    public static void main(String[] args) {
        int[] arr1={-8,-7,1,3};
        int[] arr2={-1,-6,1,2};

        System.out.println(findUnion(arr1,arr2, arr1.length,arr2.length));
    }

// Bruteforce Approach TC->O(n logn)+O(m log(m+n)) SC->O(n+m)+O(n+m)
//    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
//    {
//
//        Set<Integer> orderedSet = new TreeSet<>();
//        ArrayList<Integer> temp= new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            orderedSet.add(arr1[i]);
//
//        }
//        for (int i = 0; i < m; i++) {
//            orderedSet.add(arr2[i]);
//
//        }
//
//
//        temp.addAll(orderedSet);
//
//
//
//        return temp;
//
//
//    }



//    Optimal Approach TC-> O(N+M)   SC->)(N+M)

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        int i=0;
        int j=0;
        ArrayList<Integer> list = new ArrayList<>();

        while (i < n && j < m) {


            if (arr1[i] <= arr2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != arr1[i]) {
                    list.add(arr1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != arr2[j]) {
                    list.add(arr2[j]);
                }
                j++;

            }
        }
        while (i < n) {
            if (list.get(list.size() - 1) != arr1[i]) {
                list.add(arr1[i]);
            }
            i++;

        }

        while (j < m) {

            if (list.get(list.size() - 1) != arr2[j]) {
                list.add(arr2[j]);
            }
            j++;

        }
        return list;
    }
    }


