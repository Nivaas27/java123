class empdetails extends Thread{
    String empname;
    String empqualfication;
    int passoutyear;
    double cgpa;
    empdetails(String empname,String empqualfication,int passoutyear, double cgpa){
        this.empname = empname;
        this.empqualfication =empqualfication;
        this.passoutyear =passoutyear;
        this.cgpa = cgpa;
    }
   public void run (){
        System.out.println("THE EMPLOYEE DETAILS ARE : ");
        System.out.println("EMPNAME :" +empname+"\n"+"EMP-QUALFICATION :"+empqualfication+"\n"+"PASS-OUT-YEAR :"+passoutyear+"\n"+"CGPA :"+cgpa );
        System.out.println("------------------------------");
   }

}
class application extends Thread{
    String role;
    String skills;
    String location;
    int ctc;
    application(String role, String skills,String location,int ctc){
        this.role=role;
        this.skills=skills;

        this.location=location;
        this.ctc=ctc;
    }
    public void run(){
        System.out.println("THE APPLICATION DETAILS ARE :");
        System.out.println("ROLE : "+role+"\n"+"SKILLS: "+skills+"\n"+ "LOCATION : " +location+ "\n"+"CTC: " +ctc);
        System.out.println("------------------------------");
    }

}
class company extends Thread{
    String companyname;
    String bond;
    company(String companyname, String bond){
        this.companyname=companyname;
        this.bond=bond;

    }
    public void run(){
        System.out.println("THE COMPANY DETAILS ARE :" );
        System.out.println("COMPANY NAME:" +companyname+ "\n"+"BOND :"+bond);

    }

}
public class employeeportal {
    public static void main(String[] args) {
        empdetails d = new empdetails("saikumar","B-tech",2026 , 9.24);
        d.start();
        try{
            Thread.sleep(2000);
        }
        catch (Exception e){
            System.out.println(e);
        }

        application a = new application ("JAVA FULL STACK","HTML,CSS,JAVA,JAVASCRIPT","ANANTAPUR",1200000);
        a.start();
        try{
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        company c = new company("GOOGLE","FIVE-YEARS");
        c.start();
        try{
            Thread.sleep(4000);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
