package collectionFramework.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImpl {
    public static void main(String[] args) {
//        arrayList is datastructures that uses array in backend
        List<String> fruits = new ArrayList<>();



        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("kiwi");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0));

        // Iterating through the list
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
//
//        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);



    }
}
