package college;

import java.util.Scanner;

// root of a number without sqrt function
public class bassignment14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<=num/2+1;i++)
        {
            if(i*i==num)
            {
                System.out.println("The root of the number is"+i);
                break;
            }
        }

    }
}
