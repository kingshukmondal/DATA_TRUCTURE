package college;

class person
{
    public void meth1()
    {
        System.out.println("This is inside the meth1  of the person class !!");
    }
}


class child1 extends person
{
    public void meth2()
    {
        super.meth1();
    }
}
public class dassignment4
{
    public static void main(String[] args) {
        new child1().meth2();
    }
}
