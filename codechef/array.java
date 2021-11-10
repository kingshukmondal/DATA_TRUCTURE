import java.io.PrintStream;

class one
{
    private int a,b;
    /**
     * private data members canbe accessed within the same class
     */

    static class two
    {
        public static void printSome()
        {
            System.out.println("Learning java");
        }
    }
    public void getData(int a,int b)
    {
       this.a=a;
       this.b=b;
    }

    public int getA()
    {
        return a;
    }

    public int getB()
    {
        return b;
    }
}

class array
{
    public static void main(String[] args) {
        one jusobj=new one();

        /**
         * one-> class name
         * one justone -> referance variable
         * new -> assign mem
         * ()-> cons
         * new one()-> object creation
         *
        System.out.println(jusobj.getA()+" "+jusobj.getB());
        jusobj.getData(10,20);
        System.out.println(jusobj.getA()+" "+jusobj.getB());*/


        PrintStream sc=System.out;

        sc.println("Hello");
    }
}