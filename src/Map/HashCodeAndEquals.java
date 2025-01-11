package Map;

import java.security.PublicKey;
import java.util.HashMap;

public class HashCodeAndEquals {

    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Shiva",1);
        Person p2 = new Person("Sachin",2);
        Person p3 = new Person("Shiva",1);

        map.put(p1, "Engineer");
        map.put(p2, "Manager");
        map.put(p3, "Lawyer");
        System.out.println("size of map" + map.size());
        System.out.println("person p1 is" + map.get(p1));
        System.out.println("person p3 is " + map.get(p3));


    }

   public class Person{

        private String name;
        private int id;

        public Person(String name, int id){
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
