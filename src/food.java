class order1 implements  Runnable{
    int orderid;
    String foodname;
    order1(int orderid, String foodname){
        this.orderid=orderid;
        this.foodname=foodname;
    }

    public void run() {
         try{
             System.out.println("order "+orderid+" ("+foodname+") :order accepted" );
             Thread.sleep(1000);
             System.out.println("order "+orderid+" ("+foodname+") :preaparing food...." );
             Thread.sleep(2000);
             System.out.println("order "+orderid+" ("+foodname+") :packing food...." );
             Thread.sleep(3000);
             System.out.println("order "+orderid+" ("+foodname+") :ready for delivery..." );
             Thread.sleep(4000);
         }
         catch (Exception e){
             System.out.println("order"+orderid+"was interrupted");
         }
    }
}


public class food {
    static void main(String[] args) {
        order1 o = new order1(121, "Briyani");
        Thread t1 = new Thread(o);
        t1.start();

        order1 o2 = new order1(122,"pizza");
        Thread t2 = new Thread(o2);
        t2.start();

        order1 o3 = new order1(123, "Dosa");
        Thread t3 = new Thread(o3);
        t3.start();



    }
}
