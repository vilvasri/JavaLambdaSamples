package FunctionalInterfaceSamples;

public class CustomInterface {
    public static void main(String[] args) {
        HelloFunction h = (name) -> System.out.println("Hello, "+ name);
        h.sayHello("Mary");
    }
}

@FunctionalInterface
interface HelloFunction {
    void sayHello(String name);
}