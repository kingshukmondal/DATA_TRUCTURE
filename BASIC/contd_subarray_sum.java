package BASIC;

import java.util.Scanner;

public class contd_subarray_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        for (int i=0;i<5;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the number whose sum is to be found :");
        int p=sc.nextInt();
        boolean f=false;

        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                int sum=0;
                int a,b;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+arr[k];
                }
                if(sum==p)
                {
                    System.out.println("Found");
                    System.out.println(arr[i]+" ..to.. "+arr[j]);
                    f=true;
                    break;
                }
            }
            if (f)
            {
                break;
            }
        }

        if(!f)
        {
            System.out.println("not found");
        }
    }
}
