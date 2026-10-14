import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptio1 {
 public static void main(String[] args) {
     try{
         FileReader obj=new FileReader("demo.txt");
     } catch (FileNotFoundException e) {
         System.out.println("File not found"+e);
     }
     catch(Exception e){
         System.out.println("developers"+e);
     }

  }
}
