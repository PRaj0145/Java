package Map;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Akshay");
        map.put(2,"Biresh"); // insert the key and value
        map.put(3,"Vishal");
        map.put(4,"P.Raj");
        System.out.println(map);

        String student = map.get(4); // get the value from list or dictionary
        System.out.println(student);

        System.out.println(map.containsKey(2)); // key contains  key or value   return boolean

        System.out.println(map.containsValue("Akshay"));

        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
            entry.setValue(entry.getValue().toUpperCase());

        }
        System.out.println(map);

    }
}
