public class Exception2 {
    public static void main(String[] args){
        int a=8;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("the denominatior number should not be zero" +e);
        }
    }


}
