package FunctionalInterfaceSamples;

public class CustomCalculatorFI {
    public static void main(String[] args) {
        Calculator add = (a,b) -> a + b;
        Calculator diff = (a,b) -> a - b;
        Calculator mul = (a,b) -> a * b;
        Calculator div = (a,b) -> a/b;

        System.out.println(add.calc(2,3));
        System.out.println(diff.calc(5,1));
        System.out.println(mul.calc(2,3));
        System.out.println(div.calc(10,2));
    }
}

@FunctionalInterface
interface Calculator {
    int calc(int a, int b);
}