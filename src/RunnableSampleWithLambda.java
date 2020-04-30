import com.sun.source.tree.CompilationUnitTree;

public class RunnableSampleWithLambda {
    public static void main(String[] args) {
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("It's run 1");
            }
        };

        Runnable run2  = () -> System.out.println("It's run 2");

        run1.run();
        run2.run();
    }
}
