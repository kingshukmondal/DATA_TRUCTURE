package BASIC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class next_largest_number {
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

        for(int i=n-1;i>=0;i--)
        {
            while(!sta.isEmpty() && sta.peek()<=arr[i])
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
            sta.push(arr[i]);
        }


        Collections.reverse(a);
        System.out.println(a);
    }
}
