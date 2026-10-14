import java.util.Arrays;
import java.util.List;

public class java8 {
    static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        l1.forEach(i->System.out.println(i));

    }
}
