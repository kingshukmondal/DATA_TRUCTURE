package college;
class parent
{
    public parent()
    {
        System.out.println("Constructor of parent class !!");
    }
}

class child extends parent
{
    child()
    {
        super();
    }

}

public class dassignemnt3 {
    public static void main(String[] args) {
        child c=new child();
    }

}
