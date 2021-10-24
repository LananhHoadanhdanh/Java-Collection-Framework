package trienKhai_Map_Interface;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Use_HashMap {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();

        numbers.put("bbb", 1);
        numbers.put("aaa", 2);
        numbers.put("ccc", 3);

//        System.out.println("Map: " + numbers);
//
//        System.out.println("Keys: " + numbers.keySet());
//
//        System.out.println("Values: " + numbers.values());
//
//        System.out.println("Entries: " + numbers.entrySet());

//        int value = numbers.remove("Two");
//        System.out.println("Removed Value: " + value);

        Set<String> keys = numbers.keySet();

        System.out.println("+__________+__________+");
        System.out.printf("|%-10s|%-10s|%n", "Key", "Value");
        System.out.println("+__________+__________+");

        for (String key: keys){
            System.out.printf("|%-10s|%-10s|%n",key,numbers.get(key));
        }
        System.out.println("+__________+__________+");
    }
}
