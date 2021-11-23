package aapn_college;

import java.util.Scanner;
import java.util.Stack;

public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        Stack<Integer> sta=new Stack<>();
        for(int i=0;i<n;i++)
        {
            while (!sta.isEmpty() && sta.peek()<arr[i])
            {
                sta.pop();
            }
            if(sta.isEmpty())
            {
                System.out.println(arr[i]);
            }
            else
            {
                System.out.println(sta.peek());
            }
            sta.push(arr[i]);
        }
    }
}
