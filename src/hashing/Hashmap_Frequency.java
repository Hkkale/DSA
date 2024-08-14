package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Hashmap_Frequency {

    public static void main(String[] args) {
        int[] arr= {1,1,1,1,1,1,6,6,6,8,8,9,9,6,7,1,4,2,8,9,3,0,0,7,8};

        Map<Integer, Integer> map = new HashMap<>();

        for(int Key:arr){
            int freq=0;
            if(map.containsKey(Key)){
                freq=map.get(Key);
            }
            freq++;
            map.put(Key,freq);
        }

        Scanner sc = new Scanner(System.in);

//        Iterate in Map
//        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
//            System.out.println(it.getKey() + "->" + it.getValue());
//        }

        int q= sc.nextInt();

        while(q-- !=0) {
            int number = sc.nextInt();

            if (map.containsKey(number)) {
                System.out.println(map.get(number));
            } else {
                System.err.println("0");
            }

        }
    }


}

