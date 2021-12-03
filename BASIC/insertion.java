package BASIC;

import java.util.Arrays;
import java.util.Scanner;

public class insertion {
    public static void main(String[] args) {
        int arr[]={5,4,2,1,6,3,6};
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=0;
            for(j=i-1;j>=0 && arr[j]>current;j--)
            {
                arr[j+1]=arr[j];
            }
            System.out.println(Arrays.toString(arr));
            arr[j+1]=current;
        }

        System.out.println(Arrays.toString(arr));
    }
}
