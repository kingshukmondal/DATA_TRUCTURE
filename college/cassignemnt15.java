package college;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class cassignemnt15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[][]=new int[10][10];
        int arr1[][]=new int[10][10];
        System.out.println("Enter the number of rows");
        int n=sc.nextInt();
        System.out.println("Enter the Matrix one ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }


        System.out.println("enter the matrix two :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }

        int sumarray[][]=new int[10][20];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sumarray[i][j]=arr1[i][j]+arr[i][j];
            }
        }

        System.out.println("The sum of the array is ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(sumarray[i][j]+",");
            }
            System.out.println();
        }

    }
}
