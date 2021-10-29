package sortting;
import java.util.Scanner;

public class bubble {

   public static void main(String[] args) {
       
    Scanner sc=new Scanner(System.in);
    System.out.print("NUMBER :");
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("Arr["+(i+1)+"]: ");
        arr[i]=sc.nextInt();
    }

    boolean p=true;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<n-i-1;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                p=false;
            }
        }
        if (p==true)
        {
            System.out.println("The list is already sorted ::");
            break;
        }
        System.out.print("Pass "+(i+1)+"\t\t");
        for(int k:arr)
        {
            System.out.print(k+" ");
        }
        System.out.println();
    }
    

   
}
}
