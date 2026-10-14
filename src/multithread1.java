class four extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("thread1");

        }
    }
}
class five extends Thread {
    public void run() {

        System.out.println("thread2");
    }
}
class six extends Thread {
    public void run() {

        System.out.println("thread3");
    }
}
public class multithread1 {
    public static void main(String[] args) {
        four obj = new four();
        five obj1 = new five();
        six obj2=new six();

        obj.start();
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        obj1.start();
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        obj2.start();
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}
