package BASIC;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;


/**
 * input :N = 6
 * arr[] = {3,0,0,2,0,4}
 * Output:
 * 10
 */


public class maximum_Area_Histogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={6,2,5,4,5,1,6};
        int n=7;

        int minArr[]=getMinatleft(arr,n);
        int maxArr[]=getMinAtRight(arr,n);
        int area[]=new int[n];

        for (int i=0;i<n;i++)
        {
            area[i]=(maxArr[i]-minArr[i]-1)*arr[i];
        }

        System.out.println(Arrays.toString(area));
    }

    private static int[] getMinAtRight(int[] arr, int n) {
        Stack<Integer> sta1=new Stack<>();

        int array[]=new int[n];

        for (int i=n-1;i>=0;i--)
        {
            while (!sta1.isEmpty() && arr[sta1.peek()]>=arr[i])
            {
                sta1.pop();
            }
            if(sta1.isEmpty())
            {
                array[i]=n;
            }
            else
            {
                array[i]=sta1.peek();
            }
            sta1.push(i);
        }
        System.out.println(Arrays.toString(array));
        return  array;

    }

    public static int[] getMinatleft(int arr[], int n)
    {
        Stack<Integer> sta1=new Stack<>();

        int array[]=new int[n];

        for(int i=0;i<n;i++)
        {
            while (!sta1.isEmpty() && arr[sta1.peek()]>=arr[i])
            {
                sta1.pop();
            }
            if(sta1.isEmpty())
            {
                array[i]=-1;
            }
            else
            {
                array[i]=sta1.peek();
            }
            sta1.push(i);
        }
        System.out.println(Arrays.  toString(array));
        return  array;
    }
}


