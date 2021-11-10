package college;

class  Vehicle
{
    int a,b,c;
}

class Car extends Vehicle
{
    public void setData(int a,int b,int c)
    {
        super.a=a;
        super.b=b;
        super.c=c;
    }

    public void printData()
    {
        System.out.println("a="+super.a);
        System.out.println("b="+super.b);
        System.out.println("c="+super.c);
    }
}
public class dassignment5 {
    public static void main(String[] args) {
        Car c=new Car();
        c.setData(10,132,23);
        c.printData();
    }
}
