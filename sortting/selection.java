package sortting;
import java.util.Scanner;

public class selection {
   public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
        System.out.print("NUMBER :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Arr["+(i+1)+"]: ");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[i])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
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
