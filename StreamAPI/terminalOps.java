package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class terminalOps {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // collect

        list.stream().skip(1).collect(Collectors.toList());
        list.stream().skip(1 ).toList(); // in new version of java write direct tolist for unmodified.

        // forEach
        list.stream().forEach(x -> System.out.println(x));

        // reduce --> combines elements to produce a single result.

        Optional<Integer>  OptinalInteger  = list.stream().reduce(Integer::sum); // using a method reference.
        System.out.println(OptinalInteger.get());

        // count

        // anyMatch , allMatch , noneMatch   i.e short circuit methods

        boolean b = list.stream().anyMatch(x -> (x % 2 == 0));
        System.out.println(b);

        boolean b1 = list.stream().allMatch(x -> (x > 0));
        System.out.println(b1);

        boolean b2 = list.stream().noneMatch(x -> (x < 0));
        System.out.println(b2);

        // findFirst , findAny  // i.e short circuit methods

        System.out.println(list.stream().findFirst().get());

        System.out.println(list.stream().findAny().get());

        // toArray

        System.out.println(Stream.of(1,2,3).toArray());

        // min / max

        System.out.println("Max : "+  Stream.of(2, 44, 66, 88).max((o1, o2) -> o2 - o1).get());

        System.out.println("Min : "+  Stream.of(2, 44, 66, 88).min(Comparator.naturalOrder()).get());

        // forEachOrdered
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Using forEach with parallel stream:");
        numbers.parallelStream().forEach(System.out::println); // without Ordering

        System.out.println("Using forEachOrdered with parallel stream:");
        numbers.parallelStream().forEachOrdered(System.out::println); // with ordered


        // examples Filtering and Collecting

        List<String> list1 = Arrays.asList("Vijay", "Ajay", "Ram", "Sam", "Viraj");
        System.out.println(list1.stream().filter(x -> (x.length() <= 3)).collect(Collectors.toList()));

        // Examples : Squaring and sorting

        List<Integer> numbers1 = Arrays.asList(2, 5, 8, 7, 12, 9);
        System.out.println(numbers1.stream().map(x -> x * x).sorted().toList());

        // example : summing numbers
        List<Integer> numbers2 = Arrays.asList(5, 8, 19, 7, 6);
        System.out.println(numbers2.stream().reduce(Integer::sum).get());

        // example  counting occurence of character.

        String sentence = "Welcome to Dharwad Coder's Fest";
        System.out.println(sentence.chars().filter(x -> (x == 'e')).count());


    }
}
