package BASIC;

public class Demo {
    public static void main(String[] args) {
       // Java j=new Java(15);
        Java k=new Java();


    }
}

class Java
{
   int a;
   static  int x;
   Java(int a)
   {
       this.a=a;
       System.out.println(a);

   }
   Java()
   {
       this(10);
       System.out.println("Def cons");
   }



}
