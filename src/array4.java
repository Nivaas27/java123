import java.util.Scanner;

//find the largest number in array imp //
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        int[] array = new int[n]; //size is mandatory//
        System.out.println("enter the aray emlements :");// intalize values in array by for loop//
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0;
        for(int i=0; i< array.length; i++){
            if(array[i]>max)
            {
                max=array[i];

            }

        }
        System.out.println("the largest number is :"+max);
    }
}
