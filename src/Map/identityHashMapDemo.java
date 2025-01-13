package Map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;


public class identityHashMapDemo {
    public static void main(String[] args) {
        String k1 = new String("key");
        String k2 = new String("key");

        System.out.println( System.identityHashCode(k1)); // identity hash code are different
        System.out.println( System.identityHashCode(k2));

        Map<String, Integer> map = new IdentityHashMap();

        //use identityHashMap and == reference of object can check it.
        map.put(k1,1);
        map.put(k2,2);
        System.out.println(map);

    }
}
