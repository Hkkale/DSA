package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap_Character_Freq {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        Map<Character, Integer> map = new HashMap<>();

        for(char ch: str.toCharArray()){
            int freq=0;
            char Key=ch;


            if(map.containsKey(Key)){
                freq= map.get(Key);

            }
            freq++;
            map.put(Key,freq);

        }


        int q= sc.nextInt();

        while(q-- !=0){
            char ch =sc.next().charAt(0);
            if(map.containsKey(ch)){
                System.out.println(map.get(ch));
            }
            else{
                System.out.println(0);
            }
        }


    }
}
