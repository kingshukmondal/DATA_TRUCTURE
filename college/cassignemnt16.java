package college;

import java.util.Scanner;

public class cassignemnt16 {
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



        boolean f=true;
        int sumarray[][]=new int[10][20];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]!=arr1[i][j])
                {
                    System.out.println("Not equal");
                    f=false;
                    break;
                }
            }
        }


        if(f)
        {
            System.out.println("Equal !!");
        }



    }
}
