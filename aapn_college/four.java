package aapn_college;

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

        for(int i=0;i<check.length;i++)
        {
            if(check[i]!=0 && check[i]%2!=0)
            {
                System.out.println((char) i);
                break;
            }
        }
    }
}