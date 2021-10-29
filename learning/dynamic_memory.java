package learning;
class phone
{
    void turrnon()
    {
        System.out.println("the phone is turned on ");
    }

    void cancall()
    {
        System.out.println("Yes i can call");
    }
}

class smartphone extends phone
{
    @Override
    void turrnon()
    {
        System.out.println("Yes the smartphone is turned on");
    }

    void playgame()
    {
        System.out.println("PUBG cholbena");
    }
}
public class dynamic_memory {
    public static void main(String[] args) {
        phone nokia=new smartphone();
        nokia.cancall();
        nokia.turrnon();

    }
}
