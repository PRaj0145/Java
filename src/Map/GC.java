package Map;

import java.lang.ref.WeakReference;

public class GC {
    public static void main(String[] args) {
        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("16 pro max", "iphone"));
        System.out.println(phoneWeakReference.get());
        System.gc();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ignored) {
        }
        System.out.println(phoneWeakReference.get());
    }


     public static class Phone {

        String brand;
        String model;

        public Phone(String model, String brand) {
            this.brand = brand;
            this.model = model;
        }

        @Override
        public String toString() {
            return "phone{" +
                    "Brand='" + brand + '\'' +
                    ", Model='" + model + '\'' +
                    '}';
        }
    }

}