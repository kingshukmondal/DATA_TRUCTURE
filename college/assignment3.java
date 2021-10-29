package college;
//Palindrome
import java.util.Scanner;

public class assignment3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        final int number =n;
        int num=0;
        while (n!=0)
        {
            int rem=n%10;
            num=num*10+rem;
            n/=10;
        }

        if(num==number)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not  Palindrome");
        }

    }
}
