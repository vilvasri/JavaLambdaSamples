package FunctionalInterfaceSamples;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class FunctionalInterface2 {
    public static void main(String[] args) {
        Consumer<String> consumer = (user)-> System.out.println("Hello, "+ user);

        for(String name: Arrays.asList("Linda", "Mary", "Gita")) {
            consumer.accept(name);
        }

        BiFunction<String, String, String> concat = (a,b)-> a+b;
        String s = concat.apply("Hello", "world");
        System.out.println(s);
    }
}
