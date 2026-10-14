import java.util.Scanner;
//find the smallest number in array imp //
    public class minnum {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
            int[] array = new int[n]; //size is mandatory//
            System.out.println("enter the array emlements :");// intalize values in array by for loop//
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextInt();
            }
            int min = array[0];
            for(int i=0; i< array.length; i++){
                if(array[i]<min)
                {
                    min=array[i];

                }

            }
            System.out.println("the smallest number is :"+min);
        }
    }


