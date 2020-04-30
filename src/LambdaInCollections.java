import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaInCollections {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList( "mango", "apple", "orange", "banana");

        Collections.sort(fruits, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });

        System.out.println(fruits);

        List<String> fruits1 = Arrays.asList( "mango", "apple", "orange", "banana");
        Collections.sort(fruits1, (a,b) -> b.compareTo(a));
        System.out.println(fruits1);



    }
}
