package college;
//Prime number
import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        boolean val=true;
        for(int i=2;i<num;i++)
        {
            if(num%2==0)
            {
                val=false;
                break;
            }
        }
        if(val)
        {
            System.out.println("The number is prime !!");
        }
        else{
            System.out.println("The number is not prime !!");
        }
    }
}
