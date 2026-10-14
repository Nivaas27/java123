class one extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread1");
        }
    }
}
class two extends Thread {
    public void run() {

        System.out.println("thread2");
    }
}
class three extends Thread {
    public void run() {

        System.out.println("thread3");
    }
}
public class multithread {
public static void main(String[] args) {
      one obj = new one();
      two obj1 = new two();
      three obj2=new three();
      obj.start();
      obj1.start();
      obj2.start();

    }
}
