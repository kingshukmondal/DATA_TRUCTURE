package BASIC;

import java.util.HashMap;
import java.util.Scanner;

public class longest_alternating_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        HashMap<Integer,Integer> has=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        int start=0;
        int end=0;
        int len =1;

        for (int i=0;i<n-1;i++)
        {
           if(arr[i]*arr[i+1]>0)
           {
               has.put(i,arr[i]);
               has.put(i+1, arr[i+1]);
               end=i+1;
               len++;
               if(start-end>len)
               {
                   len=start-end; 
               }
           }
           else
           {
               len=1;
           }
        }


        for(int i=start;i<=end;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
