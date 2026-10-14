import java.util.Scanner;
//counting even and odd numbers//
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        System.out.println("enter the size of array : ");
        int n = sc.nextInt();
        int[] array = new int[n]; //size is mandatory//
        System.out.println("enter the aray elements :");// intalize values in array by for loop//
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        for (int i : array)
        {
            if (i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("the even number count is :" + even);
        System.out.println("the odd number count is :" + odd);
    }
}
