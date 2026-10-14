import java.util.ArrayDeque;
import java.util.Queue;

public class queue2 {
    static void main(String[] args) {
        Queue<Integer> q2=new ArrayDeque<>();
        q2.offer(20);
        q2.offer(100);
        q2.offer(30);
        q2.add(40);
        System.out.println(q2);
        q2.poll();
        System.out.println(q2);
        System.out.println(q2.peek());
        System.out.println(q2.element());
        System.out.println(q2.remove(40));
        System.out.println(q2);
    }
}
