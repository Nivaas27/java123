import java.util.Stack;

public class stack1 {
    static void main(String[] args) {
        Stack s=new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.add(40);
        System.out.println(s);
        System.out.println(s.search(10));
        System.out.println(s.empty());

        s.pop();
        System.out.println(s);
    }
}
