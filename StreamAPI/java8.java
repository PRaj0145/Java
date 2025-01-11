package StreamAPI;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class java8 {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

        MathOperation sumOperation = (a, b) -> a + b; // functional interface  reffarence can hold lambda expression.
        MathOperation subOperation = (a, b) -> a - b;
        MathOperation mulOperation = (a, b) -> a * b;


        int res = sumOperation.opetrate(1, 2);
        System.out.println(res);

        // Prediacte --> Functional Interface (Boolean Valued Function).
        // hold the one condition and condition can store in a one variable.

        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> startingWithP = x -> x.toLowerCase().startsWith("p");
        Predicate<String> endingWithj = x -> x.toLowerCase().endsWith("j");
        Predicate<String> and = startingWithP.and(endingWithj);// .and is combine method.

        System.out.println(and.test("Piraj"));


        // Function -->
        Function<Integer, Integer> doubleIt = x -> x * 2;
        Function<Integer, Integer> tripleIt = x -> x * 3;
        System.out.println(doubleIt.andThen(tripleIt).apply(200));
        System.out.println(doubleIt.compose(tripleIt).apply(200));
        System.out.println(doubleIt.apply(100));

        Function<Integer, Integer> identity = Function.identity(); // this input take and return same value.
        System.out.println(identity.apply(5));


        // Consumer -->

        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(500);

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x) {
                System.out.println(i);
            }

        };
        printList.accept(list);


        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // Combined example of all Methods.

        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }


        // BiPreadicate , BiConsumer , BiFunction

        BiPredicate<Integer, Integer> isSumEven = (x, y) -> (x + y) % 2 == 0;
        System.out.println(isSumEven.test(5, 4));

        BiConsumer<Integer, String> biConsumer = (x, y) -> {
            System.out.println(x);
            System.out.println(y);
        };

        BiFunction<String, String, Integer> biFunction = (x, y) -> (x + y).length();
        System.out.println(biFunction.apply("a", "bc"));

        UnaryOperator<Integer> a = x -> 2 * x; // use for Function
        BinaryOperator<Integer> b = (x, y) -> (x + y); // Bifunction


        // Mrethod reference --> use method without invoking and in place of lambda expression.

        List<String> students = Arrays.asList("Ram", "Shiva", "Sachin", "Vishal");
        students.forEach(x -> System.out.println(x)); // lambda expression
        students.forEach(System.out::println); // Method Reference


        // Constructor Reference

        List<String> names = Arrays.asList("A", "B", "C", "D");
       // List<MobilePhone> mobilePhoneList = names.stream().map(x -> new MobilePhone(x)).collect(Collectors.toList()); // Using lambda exprssion
        List<MobilePhone> mobilePhoneList = names.stream().map(MobilePhone::new).collect(Collectors.toList()); // using constructor reference
        //System.out.println(mobilePhoneList); // print stream API MobilePhone references.
    }
}


     class  MobilePhone {
        String name;

         public MobilePhone(String name) {
             this.name = name;
         }
     }
    @FunctionalInterface
        interface MathOperation {
            int opetrate(int a, int b);
        }


