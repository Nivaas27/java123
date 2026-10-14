import java.util.PriorityQueue;
import java.util.Queue;

public class queue1 {
    public static void main(String[] args) {
        Queue<Integer> q1 = new PriorityQueue<>();
        q1.offer(10);
        q1.offer(20);
        q1.offer(30);
        q1.add(40);
        System.out.println(q1);
        q1.poll();
        System.out.println(q1);
        System.out.println(q1.peek());
        System.out.println(q1.element());
        System.out.println(q1.remove(40));
        System.out.println(q1);



    }
}
