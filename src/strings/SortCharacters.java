package strings;

import java.util.*;

//class Pair{
//    int freq;
//    char ch;
//
//    @Override
//    public String toString() {
//        return "Pair{" +
//                "freq=" + freq +
//                ", ch=" + ch +
//                '}';
//    }
//
//    Pair(int freq, char ch){
//        this.freq=freq;
//        this.ch=ch;
//
//    }}




public class SortCharacters {
    public static void main(String[] args) {
        String s="tree";

        System.out.println(sortCharacters(s));
    }

    private static List<Character> sortCharacters(String s) {










//        Pair[] pair=new Pair[26];
//
//        for(int i=0;i<26;i++){
//            pair[i]=new Pair(0,(char)(i+'a'));
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            pair[s.charAt(i)-'a'].freq++;
//
//        }
//        System.out.println(Arrays.toString(pair));
//        Arrays.sort(pair, (p1, p2) -> {
//            if (p1.freq != p2.freq) return p2.freq - p1.freq;
//            return p1.ch - p2.ch;
//        });
//
//        List<Character> result = new ArrayList<>();
//        for (Pair p : pair) {
//            if (p.freq > 0) result.add(p.ch);
//        }
//        return result;
        return null;
    }




}
