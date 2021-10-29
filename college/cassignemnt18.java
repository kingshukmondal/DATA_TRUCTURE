package college;

import java.util.Scanner;

public class cassignemnt18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();

        int arr[][]=new int[n][n];
        int arr1[][]=new int[n][n];

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
            for (int j=0;j<n;j++)
            {
                arr[i][j]=arr1[j][i];
            }
        }

        System.out.println("The Transpose matrix is :");
        for(int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
