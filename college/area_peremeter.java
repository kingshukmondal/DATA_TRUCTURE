package college;
/*
OUTPUT:

FOR EQ. TRIANGLE OF BASE 10 & HEIGHT 10
Area ::50.0
Peremeter::30
FOR RECTRANGLE OF LEN 10 & BASE 10
Area ::100.0
Peremeter::40

 */
class Parent_base
{
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    int base;
}


class Triangle extends Parent_base
{
    Triangle(int base,int height)
    {
        setBase(base);
        area(getBase(),height);
        peremeter(getBase());
    }

    public  void area(int base,int height)
    {
        double k=0.5*base*height;
        System.out.println("Area ::"+k);
    }

    public void peremeter(int side)
    {
        System.out.println("Peremeter::"+3*side);
    }
}


class Rectrangle extends Parent_base
{
    Rectrangle(int len,int bred)
    {
        setBase(bred);
        area(len,getBase());
        peremeter(len,getBase());
    }

    public void area(int len,int b)
    {
        double k=len*b;
        System.out.println("Area ::"+k);
    }

    public void peremeter(int len,int b)
    {
        System.out.println("Peremeter::"+2*(len+b));
    }
}
public class area_peremeter {
    public static void main(String[] args) {
        System.out.println("FOR EQ. TRIANGLE OF BASE 10 & HEIGHT 10");
        new Triangle(10,10);
        System.out.println("FOR RECTRANGLE OF LEN 10 & BASE 10");
        new Rectrangle(10,10);
    }
}
