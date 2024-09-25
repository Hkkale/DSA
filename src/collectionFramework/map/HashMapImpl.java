package collectionFramework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<String,Integer> students=new HashMap<>();

        students.put("bala",18);
        students.put("Hiten",16);
        students.put("Anshul",25);
        students.put("Sonal",20);
        students.put("Nitika",22);
        students.put("preeti",28);

        for (Map.Entry<String,Integer> e:students.entrySet()){
            System.out.println("name:- "+e.getKey());
            System.out.println("Age:- "+e.getValue());
            System.out.println("========================================");
        }

        for (String key : students.keySet()){
            System.out.println(key);

        }
        for (Integer value : students.values()){
            System.out.println(value);

        }
    }
}
