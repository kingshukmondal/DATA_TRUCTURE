package college;

import java.util.Scanner;

public class assignment10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int x=(((a<b)?a:b)<c)?((a<b)?a:b):c;
        System.out.println("the Smallet number is "+x);

    }
}
