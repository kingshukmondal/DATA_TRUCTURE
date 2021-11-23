package aapn_college;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/*
    1 2 3 7 5
    12
 */
public class subarray_sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int summation=sc.nextInt();

        Deque<Integer> de=new LinkedList<>();
        int x=0;
        int sum=0;
        while (x<=n)
        {
            if(sum<summation)
            {
                de.addLast(arr[x]);
                sum=sum+de.peekLast();
                x++;
            }
            else if(sum>summation)
            {
                int l=de.pollFirst();
                sum=sum-l;
            }
            if(sum==summation)
            {
                System.out.println(de);
                break;
            }
        }

    }
}
