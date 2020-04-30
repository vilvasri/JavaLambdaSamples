package FunctionalInterfaceSamples;

import java.sql.Struct;
import java.util.function.*;

public class FunctionalInterface1 {
    public static void main(String[] args) {
        Predicate<String> stringPredicate = (s)->s.length() < 5;
        System.out.println("Predicate sample: " + stringPredicate.test("Hello"));

        Consumer<String> consumer = (s)-> System.out.println(s.toUpperCase());
        consumer.accept("Hello World"); //doesn't return anything

        Function<Integer, String> function = (num)->Integer.toString(num);
        System.out.println("Length of the given num : " + function.apply(500).length());

        Supplier<String> supplier = ()->"Hellooooo";
        System.out.println(supplier.get());

        BinaryOperator<Integer> binaryOperator = (a,b)->a*b;
        System.out.println("a*b : " + binaryOperator.apply(5,6));

        UnaryOperator<Integer> unaryOperator = (a)->++a;
        System.out.println("++a : " + unaryOperator.apply(5));

    }
}
