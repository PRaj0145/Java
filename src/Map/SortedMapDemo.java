package Map;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {
        SortedMap<String, Integer> map = new TreeMap<>();
        map.put("Shrikant",78);
        map.put("Shiva", 89);
        map.put("Piraj", 76);
        map.put("Nagesh", 99);
        System.out.println(map);
        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
        System.out.println(map.headMap("Shiva")); // exclusive
        System.out.println(map.tailMap("Shiva"));// inclusive
        System.out.println(map.subMap( "Nagesh", "Shrikant" ));   //tokey inclusive and fromkey exclusive

    }
}
