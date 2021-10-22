package trienKhai_Map_Interface;

import java.util.Map;
import java.util.TreeMap;

public class Use_TreeMap {
    public static void main(String[] args) {
        Map<String, Integer> values = new TreeMap<>();
        values.put("bbb", 1);
        values.put("aaa", 2);
        values.put("ccc", 3);
        System.out.println("Map using TreeMap: " + values);

//        values.replace("One", 11);
//        values.replace("True", 22);
//        values.replace("Three", 22);
//        System.out.println("New Map: " + values);

//        int removedValue = values.remove("True");
//        System.out.println("Removed Value: " + removedValue);
    }
}
