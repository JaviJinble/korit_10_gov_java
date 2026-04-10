package study.ch23;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream02 {
    public static void main(String[] args) {
        Stream<Integer> numStream = Stream.of(10, 20, 30, 40);

        Stream<Integer> numStream2 = numStream.map(num -> num * 10);

        Stream<Integer> numStream3 = numStream2.filter(num -> num % 3 != 0); //  java.util.function.Predicate boolean으로 조건


        System.out.println(numStream3.toList());
        // System.out.println(numStream2.toList());
        // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
    }
}
