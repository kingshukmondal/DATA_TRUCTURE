package BASIC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * N = 7, price[] = [100 80 60 70 60 75 85]
 * Output: 1 1 1 2 1 4 6
 */


public class stock_span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Stack<Integer> sta=new Stack<>();
        ArrayList<Integer> a=new ArrayList<>();
        int count=0;
        for(int i=0;i<n;i++)
        {
            while (!sta.isEmpty() &&  arr[sta.peek()]<=arr[i])
            {
                sta.pop();
            }
            if(sta.isEmpty())
            {
                a.add(-1);
            }
            else
            {
                a.add(sta.peek());
            }
            sta.push(i);
        }
        System.out.println(a);
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            a2.add(i,i-a.get(i));
        }
        int  arr1[]=new int[n];
        for (int i =0; i < a2.size(); i++)
            arr1[i] = a2.get(i);


    }
}
