package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        long startTime  = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(1, x -> x + 1).limit(20000).toList();
        List<Long> factorialsList = list.stream().map(ParallelStream::factorial).toList();

        long endTime  = System.currentTimeMillis();
        System.out.println("Time Taken with sequential stream : " + (endTime - startTime)  + "ms");
        //System.out.println(factorialsList);



         startTime  = System.currentTimeMillis();
     factorialsList = list.parallelStream().map(ParallelStream::factorial).sequential().toList();
         endTime  = System.currentTimeMillis();
        System.out.println("Time Taken By parallel stream : " + (endTime - startTime)  + "ms");


        // cumulative sum

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.parallelStream().map(x -> sum.addAndGet(x)).toList();
        System.out.println("Exepected result of sum [1,3,6,10,15,21,28]");
        System.out.println("Actual result of Parallel stream" + cumulativeSum);

    }

    private static long factorial(int n){
        long result = 1;
        for (int i = 2; i<=n ; i++){

            result *= i;
        }
        return result;
    }
}
