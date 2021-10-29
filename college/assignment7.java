package college;

import java.util.Scanner;

//sum of natural numbers,
public class assignment7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        for (int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of the natural numbers are :"+sum);
    }
}
