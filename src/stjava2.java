import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class demo2 implements BinaryOperator<Integer>{

    @Override
    public Integer apply(Integer i, Integer j) {
        return i+j;
    }
}

public class stjava2 {
    static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> b = new demo2();
        Stream<Integer> s1 = l1.stream().reduce(b).stream();
        s1.forEach(System.out::println);


    }
}
