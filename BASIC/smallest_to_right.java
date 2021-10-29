package BASIC;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


/**
 *
 * Imp :4 5 2 10 8
 * O/P :2 2 -1 8 -1
 *
 */


public class smallest_to_right {
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
            while (!sta.isEmpty() && sta.peek()>=arr[i])
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
