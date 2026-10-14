import java.util.HashSet;
import java.util.Set;

public class set1 {
    static void main(String[] args) {
        Set<Integer> s1 =new HashSet<>();
        s1.add(10);
        s1.add(1);
        s1.add(23);
        s1.add(1);
        System.out.println(s1);
        System.out.println(s1.isEmpty());
        System.out.println(s1.size());
    }
}
