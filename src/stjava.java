import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class stjava {
    static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Predicate<Integer> p = new Predicate<Integer>() {

            public boolean test(Integer i) {
                return i % 2 == 0;

            }
        };
        Stream<Integer> s1 = l1.stream().filter(p);
        s1.forEach(System.out::println);
    }
}

