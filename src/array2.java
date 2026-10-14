public class array2 {
    public static void main(String [] args){
        int[] num ={1,2,3,4};
        num[2]=25;
        int sum =0;
        for(int i=0; i< num.length;i++)
        {
            sum =sum +num[i];
        }
        System.out.println("sum is"+sum);
        int avg= sum/num.length;
        System.out.println("avg is"+avg);
    }
}

