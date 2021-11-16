package college;
class human
{
    public human()
    {
        System.out.println("This  is a simple human");
    }

    public human(int n)
    {
        if(n==1)
            System.out.println("man");
        else
            System.out.println("female");
    }

    public void canWalk(Boolean x)
    {
        if(x)
            System.out.println("Can walk");
        else
            System.out.println("Cannot walk");
    }

    public human canEat()
    {
        System.out.println("Yes the  human cam eat !!");

        return null;
    }

}
public class dassignment7 {
    public static void main(String[] args) {
        human h=new human();
        h.canEat();
        h.canWalk(true);

        human s=new human(10);
    }
}
