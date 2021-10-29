package college;
//Factorial
import java.util.Scanner;

public class assignment4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int n=sc.nextInt();
        int num=1;
        for(int i=n;i>=1;i--)
        {
            num=num*i;
            System.out.print(i);
            if(i!=1)
            {
                System.out.print(" x ");
            }
        }
        System.out.println("  = "+ num);
    }
}
