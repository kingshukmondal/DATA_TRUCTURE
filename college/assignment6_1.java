package college;

import java.util.Scanner;

public class assignment6_1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n-i;j++)
           {
               System.out.print(" ");
           }
           for (int k=0;k<2*i-1;k++)
           {
               if(k%2!=0)
               {
                   System.out.print("0");
               }
               else
               {
                   System.out.print("1");
               }
           }
            System.out.println();
        }
        for(int i=n;i>=0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++)
            {
                if(k%2!=0)
                {
                    System.out.print("0");
                }
                else
                {
                    System.out.print("1");
                }
            }
            System.out.println();
        }

    }
}
