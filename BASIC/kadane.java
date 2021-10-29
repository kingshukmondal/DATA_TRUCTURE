package BASIC;

import java.util.Scanner;

public class kadane {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[100];
        int n;
        System.out.print("Enter the value of n");
        n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int maxsum=0,cursum=0;

        for(int i=0;i<n;i++)
        {
            cursum+=arr[i];
            if(cursum>maxsum)
            {
                maxsum=cursum;
            }
            if(cursum<0)
            {
                cursum=0;
            }
        }

        System.out.println(maxsum);

    }
}
