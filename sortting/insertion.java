package sortting;
import java.util.Scanner;

public class insertion {
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
        System.out.println("***************************");
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
            System.out.print("\tPass "+(i)+"\t\t");
            for(int k:arr)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
        System.out.println("***************************");
                for(int k:arr)
                {
                    System.out.print(k+" ");
                } 
    }
    
}
