package aapn_college;

import java.util.Arrays;
import java.util.Scanner;

public class five {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]=new int[n];
        int checker[]=new int[1000000];
        Arrays.fill(checker,0);
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            checker[arr[i]]++;
        }

        for(int i=0;i<n;i++)
        {
            int p=checker[arr[i]];
            if(p>2)
            {
                System.out.println(i+1);
                break;
            }
        }
        /*
        7
        1 5 3 4 3 5 6

        op 2
         */
    }
}
