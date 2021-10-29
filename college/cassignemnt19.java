package college;

import java.util.Scanner;

class Box
{
    private int length,breadth,height;

    void setDimension(int length,int breadth,int height)
    {
        this.breadth=breadth;
        this.length=length;
        this.height=height;
    }

    void showDimension()
    {
        System.out.println("Length :"+length);
        System.out.println("Breadth:"+breadth);
        System.out.println("Height :"+height);
    }
}
public class cassignemnt19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bre=sc.nextInt();
        int hei=sc.nextInt();

        Box b=new Box();
        b.setDimension(len,bre,hei);
        b.showDimension();
    }
}
