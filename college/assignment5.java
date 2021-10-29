package college;
//Armstrong number
import java.util.Scanner;

public class assignment5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter the data :");
        int n=sc.nextInt();
        final int num=n;
        int x=0;
        while (n!=0)
        {
            int rem=n%10;
            x=x+(int)Math.pow(rem,3);
            n/=10;
        }

        System.out.println((num==x)?"ARMSTRONG NUMBER":"NOT A ARMSTRONG NUMBER");

    }
}
