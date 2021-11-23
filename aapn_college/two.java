package aapn_college;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int dif[]=new int[n-1];
        for(int i=0;i<n-1;i++)
        {
            dif[i]=arr[i+1]-arr[i];
        }
        int i=0,x=0;
        int max=0;
        int p=0,q=0;
        for(int j=0;j<n-1;j++)
        {
            if(dif[i]!=dif[j])
            {
                i=j;
            }
            if((j-i)>max)
            {
                max=j-i;
                 p=i;q=j;
            }
        }


        for(int l=p;l<=q+1;l++)
        {
            System.out.print(arr[l]+" ");
        }



    }

}
