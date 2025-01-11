package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> isEven = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Total count of Even Numbers : " +  isEven.stream().filter(x -> x % 2 == 0).count());

        // Creating a Stream

        // using from a colection to stream
        List<Integer> list = Arrays.asList(11, 22, 1, 2, 45);
        Stream<Integer> stream = list.stream();

        // from Arrays to stream
        String[] array = {"a","b","c"};
        Stream<String> stream1 = Arrays.stream(array);

        // Using stream.of

        Stream<String> stream2 = Stream.of("a", "b");

        // infinte streams
        Stream<Integer> limit = Stream.generate(() ->1).limit(100);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);


    }
}
