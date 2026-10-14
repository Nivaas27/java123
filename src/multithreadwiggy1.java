class custom implements  Runnable
{
    String cname;
    String caddress;

    custom(String cname, String caddress)
    {
        this.cname=cname;
        this.caddress=caddress;
    }
    public void run()
    {

        System.out.println(cname+" your order is conformed  and order is deliverd to " +caddress);
    }
}
class orde implements  Runnable
{
    String  orderid;
    String  iteamname;
    double  price;

    orde(String orderid ,String iteamname ,double price)
    {
        this.orderid=orderid;
        this.iteamname=iteamname;
        this.price=price;
    }
    public void run()
    {
        System.out.println("this is you order id " +orderid+ "and item is" +iteamname+ "price " +price );
    }
}
class deliverypartne implements  Runnable{
    String  dname;
    double  pnumber;

    deliverypartne(String dname ,double pnumber)
    {
        this.dname=dname;
        this.pnumber=pnumber;
    }
    public void run()
    {
        System.out.println("delivery partner name is  "+dname+" and his phone number "+pnumber);
    }
}
public class multithreadwiggy1 {
    static void main(String[] args) {

        custom c = new custom( "nivaas","druganagar");
        Thread t1 = new Thread(c);
        t1.start();


        orde o =new orde("a2314","dosa",1200);
        Thread t2 = new Thread(o);
        t2.start();


        deliverypartne d =new deliverypartne("ajay",123456789);
        Thread t3 =new Thread(d);
        t3.start();



    }
}
