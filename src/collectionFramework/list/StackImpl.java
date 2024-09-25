package collectionFramework.list;

import java.util.Stack;

public class StackImpl {
    public static void main(String[] args) {
//       stack is  LIFO (Last In First Out)
        Stack<Integer> st= new Stack<>();
        st.push(10);

        st.push(1);
        st.push(2);


        st.push(3);

        System.out.println(st);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st);
        System.out.println(st.isEmpty());
        System.out.println(st.search(10));


    }
}
