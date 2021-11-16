package college;

class Bird
{
    public Bird()
    {
        System.out.println("This is a simple bird");
    }

    public Bird(String name)
    {
        System.out.println("The bird name is "+name+"!!" );
    }

    public Bird(int val)
    {
        System.out.println("The bird number is "+val+"!!" );
    }
}
public class dassignment6 {
    public static void main(String[] args) {
        Bird b1=new Bird();
        Bird b2=new Bird("Sparrow");
        Bird b3=new Bird(10);

    }
}
