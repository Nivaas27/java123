class movieticket implements Runnable{
    String customername;
    int age;
    movieticket(String customername,int age){
        this.customername=customername;
        this.age=age;
    }
    public void run(){
        System.out.println("CUSTOMER DETAILS");
        System.out.println("CUSTOMER NAME :"+customername+"\n"+ "CUSTOMER AGE: "+age);
        System.out.println("-----------------------------");
    }

}
class moviename implements Runnable{
    String moviename;
    String language;
    int runtime;
    int ticketprice;
    moviename(String moviename,String language,int runtime,int ticketprice){
        this.moviename=moviename;
        this.language=language;
        this.runtime=runtime;
        this.ticketprice=ticketprice;
    }
    public void run() {
        System.out.println("MOVIE DETAILS");
        System.out.println("MOVIE NAME : "+moviename+"\n"+ "LANGUAGE : "+language+"\n"+ "RUN-TIME: "+runtime+"hrs"+"\n"+"TICKET-PRICE: "+ticketprice);
        System.out.println("-----------------------------");
    }
}
class theater implements Runnable {
    String theatername;
    String location;

    theater(String theatername,String location) {
        this.theatername = theatername;
        this.location = location;
    }

    public void run() {
        System.out.println("THEATER DETAILS");

        System.out.println("THEATER-NAME:" + theatername + "\n" + "LOCATION:" + location);
        System.out.println("-----------------------------");

    }
}

class snacks implements Runnable{
        String sname;
        int quantity;
        int price;
        snacks (String sname,int quantity,int price){
            this.sname=sname;
            this.quantity=quantity;
            this.price=price;
        }
        public void run() {
            System.out.println("SNACKS AND BEWERAGES");
            System.out.println("SNACK-NAME:"+sname+"\n"+"QUANTITY:"+quantity+"\n"+"PRICE:"+price);
            System.out.println("-----------------------------");
        }
}


public class Bookmyshow {
    public static void main(String[] args) {
        movieticket obj =new movieticket("siddharth",18);
        moviename obj1=new moviename("khaleja","Telugu",3,250);
        theater obj2=new theater("AMB","Majestic");
        snacks obj3=new snacks("Popcorn",2,550);
         Thread t1 =new Thread(obj);
         Thread t2 =new Thread(obj1);
         Thread t3 =new Thread(obj2);
         Thread t4 =new Thread(obj3);
         t1.start();
         try{
             Thread.sleep(2000);
         }
         catch (Exception e){
             System.out.println(e);
         }
         t2.start();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
         t3.start();
        try{
            Thread.sleep(4000);
        }
        catch (Exception e){
            System.out.println(e);
        }
         t4.start();
        try{
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
