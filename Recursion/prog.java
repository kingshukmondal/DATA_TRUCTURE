package Recursion;

import java.util.Scanner;

public class prog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();

     //   int k=mul(2,1);
        int arr[]={2,4,6,143,10};
        String s="Kingshuk";
        rev2(s,0,s.length());

    }

    private static  int occurance(int arr[],int beg,int n,int key)
    {
        if(beg==n)
        {
            return -1;
        }
        if(arr[beg]==key)
        {
            return beg;
        }
        else
        {
          return occurance(arr,beg+1,n,key);
        }

    }

    public static void rev2(String s,int i,int n)
    {
        if(i==n)
        {
            return;
        }
        rev2(s,i+1,n);
        System.out.print(s.charAt(i));
    }

    private static int sum(int n) {
        if(n==0)
        {
            return 0;
        }
        return n+sum(n-1);
    }


    private static int mul(int n,int p)
    {
        if(p==0)
        {
            return 1;
        }
        return n*mul(n,p-1);
    }

    private static int  sorted(int arr[],int s,int n)
    {
        if(s==n)
        {
            return 1;
        }
        if(arr[s]<arr[s+1])
        {
            return sorted(arr,s+1,n);
        }
        return -1;

    }
}
