package college;

import java.util.Scanner;

public class cassignemnt17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n=sc.nextInt();
        int arr1[][]=new int[n+1][n+1];

        System.out.println("Enter the matrix :");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }


        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+arr1[i][j];
            }
            arr1[i][n]=sum;
        }


        for(int i=0;i<=n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum=sum+arr1[j][i];
            }
            arr1[n][i]=sum;
        }
        System.out.println("The sum is :");
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

    }
}
