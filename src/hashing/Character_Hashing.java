package hashing;

import java.util.Arrays;
import java.util.Scanner;

public class Character_Hashing {

    public static void main(String[] args) {
        String str="qwsdAAAAAAAAAAAZZZZZZZ11111111111}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}}";

        int[] hash = new int[256];

        for (int i = 0; i < str.length() ; i++) {
            hash[str.charAt(i)]++;

        }

        Scanner sc= new Scanner(System.in);

        int q= sc.nextInt();

        while(q-- != 0){
            char ch=sc.next().charAt(0);

            System.out.println(ch+" is "+hash[ch]+" times in the string");
        }
        System.out.println();
    }
}
