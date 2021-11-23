package sortting;

import java.util.Scanner;

public class quick_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the values of n ::");
        int  n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }

        quicksort(arr,0,n-1);

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

   static void  quicksort(int arr[],int low,int high)
   {
       if(low<high)
       {
           int pivot = partition(arr, low, high);

           quicksort(arr, low, pivot-1);
           quicksort(arr,pivot+1,high);

       }
   }

    public static int partition(int[] arr, int low, int high) {
       int pivot=arr[high];
       int i=low-1;

       for(int j=low;j<=high-1;j++)
       {
           if(arr[j]<pivot)
           {
               i++;
               int temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
           }
       }
       int temp=arr[i+1];
       arr[i+1]=arr[high];
       arr[high]=temp;
       return (i+1);
    }
}

/*
9,2,5,1,6

pivot=6

1 2 5     6  9

 */
