import java.lang.reflect.Constructor;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        System.out.println(canConstruct("aa","ab"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        List<String> list = new ArrayList<>();
        for (char ch : magazine.toCharArray()) {
            list.add(ch+"");
        }

        System.out.println(ransomNote.length());


        for (char ch:ransomNote.toCharArray()){
            if(list.contains(ch+"")){
                list.remove(ch+"");
            }
            else {
                return false;
            }
        }
        System.out.println(list);

        return true;



    }






}






















