package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class intermediateOps1 {
    public static void main(String[] args) {

        // fillter

        List<String> list = Arrays.asList("Akshay", "Vishal", "Biresh", "Ajay");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A"));
        // No filtering at this point , when add terminal point run the program
        long res = list.stream().filter(x -> x.startsWith("A")).count();
        System.out.println(res);

        // map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // sorted

        Stream<String> sorted = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((a, b) -> a.length() - b.length());

        //distinct

        System.out.println(list.stream().filter(x -> x.startsWith("A")).distinct().count());

        // limit
        System.out.println(Stream.iterate(1, x -> x + 1).limit(100).count());

        // skip
        System.out.println(Stream.iterate(1, x -> x + 1).skip(10).limit(100).count());

    }
}
