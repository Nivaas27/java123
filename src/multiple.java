import java.util.Scanner;

public class multiple {
        public   static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number of rows and col");
            int r=sc.nextInt();
            int c=sc.nextInt();
            int[][] array1=new int[r][c];
            int[][] array2=new int[r][c];
            int[][] array3=new int[r][c];
            System.out.println("enter the elements in first matrix:");
            for(int i=0;i<r;i++)
            {
                for(int j = 0; j<c;j++)
                {
                    array1[i][j]= sc.nextInt();
                }
            }
            System.out.println("enter the elements in second matrix:");
            for(int i=0;i<r;i++)
            {
                for(int j = 0; j<c;j++)
                {
                    array2[i][j]= sc.nextInt();
                }
            }
            System.out.println("the multiplication of two  matrices:");
            for(int i=0;i<r;i++)
            {
                for(int j = 0; j<c;j++)
                {
                    array3[i][j]=array1[i][j]*array2[i][j];
                }
            }
            for(int i=0;i<r;i++)
            {
                for(int j = 0; j<c;j++)
                {
                    System.out.print(array3[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

