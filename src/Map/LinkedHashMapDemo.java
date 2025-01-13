package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a new LinkedHashMap
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>(11,0.03f,true); // double Linkedlist


        // Add elements to the map
        linkedHashMap.put(20, "Orange");
        linkedHashMap.put(10, "Apple");
        linkedHashMap.put(5, "Grape");

        linkedHashMap.get(10); // caching least recently used for use it  ... accessing order.

        // Iterate over the map
        for(Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());

        }
            HashMap<String, Integer>hashMap= new HashMap();
            LinkedHashMap<String, Integer> linkedHashMap1 = new LinkedHashMap<>(hashMap); // Hashmap converted into LinkedHashMap

            hashMap.put("Biresh", 88);
            hashMap.put("Vishal", 90);
            hashMap.put("Jagdish",75);

            Integer res = hashMap.getOrDefault("Jagdish", 0);
           hashMap.putIfAbsent("Shekhar", 95);
            System.out.println(hashMap);
            System.out.println(res);
        }
    }

