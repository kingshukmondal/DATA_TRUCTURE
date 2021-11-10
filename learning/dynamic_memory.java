package learning;

import org.w3c.dom.ls.LSOutput;

interface a
{

    default   void meth1(){
        System.out.println("hello");
    }

}

interface c
{
    default   void meth1(){
        System.out.println("hello two");
    }

}

class  b implements a,c
{
    public void meth1()
    {
       c.super.meth1();
    }

}

public class dynamic_memory {
    public static void main(String[] args) {
    }
}
