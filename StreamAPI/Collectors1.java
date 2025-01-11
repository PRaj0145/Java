package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class Collectors1 {
    public static void main(String[] args) {

        // Collecting to a List
        List<String> names = Arrays.asList("Vijay", "Ajay", "Ram", "Sam", "Viraj");
        List<String> res = names.stream().filter(name -> (name.startsWith("A"))).collect(java.util.stream.Collectors.toList());
        System.out.println(res);

        // Collecting to a Set.
        List<Integer> nums = Arrays.asList(1, 2, 2, 3, 5, 4, 5, 6, 4, 8);
        Set<Integer> set = nums.stream().collect(java.util.stream.Collectors.toSet());
        System.out.println(set);

        // collecting to a specific collection
        ArrayDeque<String> collect = names.stream().collect(java.util.stream.Collectors
                .toCollection(() -> new ArrayDeque<>()));

        // Joining String
        // concatenates stream element into a single stream

      String concatenatedNames = names.stream().map(String::toUpperCase).collect(Collectors.joining(","));
        System.out.println(concatenatedNames);

        // Summerizing Data
        // Generates Statistical summary (min,max,count, sum, average)

        List<Integer> number = Arrays.asList(1, 2, 5, 4, 7, 2);
        IntSummaryStatistics stats = number.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : " + stats.getCount());
        System.out.println("Sum : " + stats.getSum());
        System.out.println("Min : " + stats.getMin());
        System.out.println("Average : " + stats.getAverage());
        System.out.println("MAx : " + stats.getMax());

        // Averaging Data

        // same as all functions to summerizing data

        Double Avg = number.stream().collect(Collectors.averagingInt(x -> x));
        System.out.println("Average : " + Avg);

        // Grouping Element
        List<String> words = Arrays.asList("Hello", "World", "welcome", "to", "Java", "Collectors");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length))); // basis on length
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.joining(",")))); // joining
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()))); // counting
        TreeMap<Integer, Long> treeMap = words.stream().collect(Collectors.groupingBy(String::length,
                TreeMap::new, Collectors.counting()));
        System.out.println(treeMap);

        // Partioning Element
        // Partions element into two groups (true or false) based on Predicate.

        System.out.println( words.stream().collect(Collectors.partitioningBy(x-> x.length() > 5)));

        // Mapping and Collecting

        System.out.println( words.stream().collect(Collectors.mapping(x -> x.toUpperCase(), Collectors.toList())));

        // 11. toMap

        // Example 1: Collecting Names by Length
        List<String> l1 = Arrays.asList("Anna", "Bob", "Alexander", "Brian", "Alice");
        System.out.println(l1.stream().collect(Collectors.groupingBy(String::length)));

        // Example 2: Counting Word Occurrences
        String sentence = "hello world hello java world";
        System.out.println(Arrays.stream(sentence.split(" ")).collect(Collectors.groupingBy(x -> x, Collectors.counting())));

        // Example 3: Partitioning Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(l2.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0)));

        // Example 4: Summing Values in a Map
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 15);
        System.out.println(items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x -> x)));

        // Example 5: Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");
        System.out.println(fruits.stream().collect(Collectors.toMap(x -> x.toUpperCase(), x -> x.length())));

        // Example 6:
        List<String> words2 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println(words2.stream().collect(Collectors.toMap(k -> k, v -> 1, (x, y) -> x + y)));;

    }


}
