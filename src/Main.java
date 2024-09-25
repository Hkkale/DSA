import java.lang.reflect.Constructor;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        String str = "lleettccooddee";
        System.out.println(firstUniqChar(str));

    }

    public static int firstUniqChar(String s) {

        int[] hash=new int[26];

        for (char ch:s.toCharArray()){
            hash[ch-'a']++;
        }

        for (char ch:s.toCharArray()){
            if(hash[ch-'a']==1){
                return s.indexOf(ch);
            }
        }

        return -1;


    }

    public static boolean isValid(String s) {

        Stack<Character> st= new Stack<>();

        for(char ch:s.toCharArray()){

            if(ch=='('){
                st.push(')');
            }
            else if (ch=='['){
                st.push(']');
            }
            else if (ch=='{'){
                st.push('}');
            }
//            else if(st.isEmpty()){
//                return false;
//            }
            else if (ch==')'){
                if(st.peek()!=')') return false;
                st.pop();

            }
            else if (ch==']'){
                if(st.peek()!=']') return false;
                st.pop();

            }
            else if (ch=='}'){
                if(st.peek()!='}') return false;
                st.pop();

            }


        }





        return st.isEmpty();



    }

}





























