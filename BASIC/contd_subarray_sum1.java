package BASIC;

import java.util.HashMap;
import java.util.Scanner;

public class contd_subarray_sum1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements :");
        int n= sc.nextInt();
        int arr[]=new int[10];
        for (int i=0;i<n;i++)
        {
            arr[i]= sc.nextInt();
        }

        System.out.println("Enter the number whose sum is to be found :");
        int p=sc.nextInt();

        HashMap<Integer,Integer> has=new HashMap<>();
        int start=0;
        int end=-1;
        int curr=0;

        for(int i=0;i<n;i++)
        {
            curr+=arr[i];
            if(curr-p==0)
            {
                start=0;
                end =i;
                break;
            }

            if(has.containsKey(curr-p))
            {
                start=has.get(curr-p)+1;
                end =i;
                break;
            }

            has.put(curr,i);
        }

        if(end ==-1)
        {
            System.out.print("Not found");
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                System.out.print(arr[i]+"+");
            }
            System.out.println("\b="+p);
        }
    }
}
