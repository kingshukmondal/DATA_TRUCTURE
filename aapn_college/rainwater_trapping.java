package aapn_college;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class rainwater_trapping {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        checker(arr,n);
    }

    private static void checker(int[] arr, int n) {

        Stack<Integer> sta=new Stack<>();
        int seet[]=new int[n];
        for(int i=0;i<n;i++)
        {

            while (!sta.isEmpty() && arr[i]>sta.peek())
            {
                sta.pop();
            }

            if(sta.isEmpty())
            {
                seet[i]=0;
                sta.push(arr[0]);
            }
            else {
                seet[i] = sta.peek();
                if (arr[i] > sta.peek()) {
                    sta.push(arr[i]);
                }
            }

            System.out.println(sta.toString());
        }

        System.out.println(Arrays.toString(seet));
    }
}
