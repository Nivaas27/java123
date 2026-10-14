class customer extends  Thread
{
    String cname;
    String caddress;

    customer(String cname, String caddress)
    {
        this.cname=cname;
        this.caddress=caddress;
    }
    public void run()
    {

        System.out.println(cname+" your order is conformed  and order is deliverd to " +caddress);
    }
}
class order extends Thread{
    String  orderid;
    String  iteamname;
    double  price;

    order(String orderid ,String iteamname ,double price)
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
class deliverypartner extends Thread{
    String  dname;
    double  pnumber;

    deliverypartner(String dname ,double pnumber)
    {
        this.dname=dname;
        this.pnumber=pnumber;
    }
    public void run()
    {
        System.out.println("delivery partner name is  "+dname+" and his phone number "+pnumber);
    }
}
public class multithreadwiggy {
    static void main(String[] args) {
        customer c = new customer( "nivaas","druganagar");
        c.start();
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);

        }

        order o =new order("a2314","dosa",1200);
        o.start();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);

        }

        deliverypartner d =new deliverypartner("ajay",123456789);
        try{
            Thread.sleep(4000);
        }
        catch (Exception e){
            System.out.println(e);

        }
        d.start();



    }
}
