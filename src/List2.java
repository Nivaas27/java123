import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List2 {
        public static  void main(String[] args) {
            List<Integer> l1=new LinkedList<>();
            l1.add(10);
            l1.add(20);
            l1.add(30);
            System.out.println(l1);
            l1.add(1,50);
            System.out.println(l1);
            l1.addFirst(100);
            System.out.println(l1);
            l1.addLast(200);
            System.out.println(l1);
            l1.remove(1);
            System.out.println(l1);
            l1.removeLast();
            System.out.println(l1);
            l1.removeFirst();
            System.out.println(l1);
            System.out.println(l1.isEmpty());
            System.out.println(l1.reversed());
            System.out.println(l1.contains(100));
            System.out.println(l1.size());

        }

}
