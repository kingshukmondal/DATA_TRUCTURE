package college;

import java.util.Scanner;

public class assignment6_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n=sc.nextInt();
        int s=n;
        for(int i=n;i>1;i--)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for (int k=n-i+1;k<=s;k++)
            {
                    System.out.print(k+" ");
            }
            if(i==2)
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
            for (int k=n-i+1;k<=s;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
