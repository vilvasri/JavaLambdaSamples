package Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamEg {
    public static void main(String[] args) {

        //Example for Sorted
        Arrays.asList("red", "orange", "blue")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println); //uses lambda
        //Example for filter
        Stream.of("red","pink","blue","purple","peach")
                .filter(color -> {
                    /**
                     System.out.println(color);
                    If i put this print statement here, below is the output. It will run with each color for filter and foreach method
                     red
                     pink
                     Starts with P : pink
                     blue
                     purple
                     Starts with P : purple
                     peach
                     Starts with P : peach
                     **/
                   return color.startsWith("p");
                })
                .forEach(color -> System.out.println("Starts with P : " + color));
    }
}
