package college;

import java.util.Scanner;

public class bassignemnt11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int x=(((a>b)?a:b)>c)?((a>b)?a:b):c;
        System.out.println("The largest number is :"+x);
    }
}
