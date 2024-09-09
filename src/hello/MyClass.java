package hello;
import java.math.BigDecimal;
import  java.util.*;

public class MyClass {

    public static void main(String[] args) {

        String name = "QWERTYSDFCVGBHSDFCGVASDCFAZSXDCFF";

        countChar(name);

    }


    public static void countChar(String str) {


        int[] hash=new int[256];

        for(int i=0;i<str.length();i++){
            hash[str.charAt(i)]++;
        }

        int maxfreq=0;
        char ch='a';

        for(int i=0;i<hash.length;i++){
            if(hash[i]>maxfreq){
                maxfreq=hash[i];
                ch=(char) i;

                
            }
        }

        System.out.println(ch+" "+maxfreq);










    }

}


























