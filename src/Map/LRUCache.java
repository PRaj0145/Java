package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUCache <String ,Integer>StudentMap = new LRUCache(3);

        StudentMap.put("Bob", 88);
        StudentMap.put("Sam", 90);
        StudentMap.put("Albert", 98);
        StudentMap.put("Jhon", 78);
        StudentMap.put("Aryan", 89);


        StudentMap.put("Bob", 88);


        System.out.println(StudentMap);

    }
}
