package college;

import java.util.Scanner;


public class  bassignemnt13 {
    //swapping of two numbers using bitwise operator
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the firstt number :");
        int a=sc.nextInt();
        System.out.println("Enter the second number ");
        int b=sc.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;


        System.out.println("a="+a+"    b="+b);


        
    }
}
