import java.util.Scanner;
// intalizing array//array size//
public class array3 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of array : ");
        int n =sc.nextInt();
        int[] array = new int[n]; //size is mandatory//
        System.out.println("enter the aray emlements :");// intalize values in array by for loop//
        for(int i=0; i< array.length;i++ ){
            array[i]= sc.nextInt();
        }
        System.out.println("the array elements are : ");//print the array elemments by for loop//
        for(int i=0; i< array.length;i++ ){
            System.out.println(array[i]);
        }

    }
}
