import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;



public class stjava3 {
    static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        BinaryOperator<Integer> b = (i,j) ->i+j;

        int r1 = l1.stream().reduce(0,(i,j)->i+j);
        System.out.println(r1);


    }
}