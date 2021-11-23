package aapn_college;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class four {
    /*
    input:7
    r g b b g y y
    output :r
     */

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char arr[]=new char[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.next().charAt(0);
        }

        int check[]=new int[256];

        Arrays.fill(check,0);

        for(int i=0;i<n;i++)
        {
            int s=arr[i];
            check[s]++;
        }
        Boolean s=true;
        for(int i=0;i<n;i++)
        {
            int k=check[arr[i]];
            if(k%2!=0)
            {
                System.out.println(arr[i]);
                s=false;
                break;
            }
        }

        if (s)
        {
            System.out.println("All are even");
        }
    }
}
