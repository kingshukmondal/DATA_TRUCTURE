package learning;

import java.util.Scanner;
class parent
{
    public void one()
    {
        System.out.println("meth 1 inside parent ");
    }

    public static void two()
    {
        System.out.println("Meth 2 inside parent");
    }

    public void three()
    {
        System.out.println("Meth 3");
    }
}

class child extends parent
{
    @Override
    public void one()
    {
        System.out.println("meth 1 inside child ");
    }

    public static void two()
    {
        System.out.println("Meth 2 inside child");
    }

    public void four()
    {
        System.out.println("Meh in ch");
    }
}
public class set_one {
    public static void main(String[] args) {

        parent p=new child();
        p.three();

    }

    }


/**
 *
 * parent p=new child();
 * child p=new child();
 *
 */
