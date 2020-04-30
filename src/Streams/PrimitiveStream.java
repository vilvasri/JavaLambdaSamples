package Streams;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStream {
    public static void main(String[] args) {
        IntStream.range(1,5)
                .forEach(System.out::println);

        //Average and mapToInt are aggregate functions of streams

        Arrays.stream(new int[] {1,2,3,4})
                .map(n -> n*n)
                .average().ifPresent(System.out::println);

        Stream.of(1.5,2.3,4.5)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);

    }
}
