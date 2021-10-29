package college;

import java.util.Scanner;

public class assignment6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        for(int i=n;i>0;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=1;k<2*i;k++)
            {
                System.out.print("*");
            }
            if(i==1)
            {
                break;
            }
            System.out.println();
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=0;k<2*i-1;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
