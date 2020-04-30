package FunctionalInterfaceSamples;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class SampleAsStaticMethodRef {
    public static void main(String[] args) {
        //Static method reference using ::
        IntFunction<String> intFunction = Integer::toString; //same as = (num) -> Integer.toString(num);
        System.out.println(intFunction.apply(6000).length());

        Function<String, BigInteger> toBigInt = BigInteger::new;
        System.out.println(toBigInt.apply("234567890"));

        Consumer<String> consumer = System.out::println;
        consumer.accept("helloooo");

        UnaryOperator<String> concat = "Hello, "::concat;
        System.out.println(concat.apply("User"));

    }
}
