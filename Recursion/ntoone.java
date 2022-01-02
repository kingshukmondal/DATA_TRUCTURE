package Recursion;

import java.util.Arrays;

public class ntoone {
    public static void main(String[] args) {

        int n=5;
        System.out.println(fun(n));
        fact(n,1);

        int arr[]={6,8,3,5,7,4};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        String s=new String("madam");
        System.out.println(rev(s,0,s.length()));


    }

    private static boolean rev(String s, int i, int length) {
        if(i>=length/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(length-i-1)) {
            System.out.println(s.charAt(i) + "--" + s.charAt(length - i - 1));
            return false;
        }
        return rev(s,i+1,length);
    }

    private static void reverse(int[] arr, int i, int n) {
        if(i>n)
        {
            return;
        }
        int temp=arr[i];
        arr[i]=arr[n];
        arr[n]=temp;
        reverse(arr,i+1,n-1);
    }

    private static int fact(int n, int i) {
        if(n==1)
        {
            System.out.println(i);
            return 1;
        }
        return fact(n-1,i*n);
    }

    private static int fun(int n) {
        if(n==0)
            return 0;
        return n+fun(n-1);
    }
}
