package learning;
class gfg extends Thread
{
    @Override
    public void run() {
        for (int i=0;i<10;i++)
        {System.out.println("Kingshuk ");
            try {Thread.sleep(1000);
            } catch (Exception E)
            {E.printStackTrace();}}
    }
}


class Boat  extends Thread
{
    public void run()
    {
        for (int i=0;i<10;i++)
        {System.out.println("Mondal ");
            try {Thread.sleep(1000);
            } catch (Exception E)
            {E.printStackTrace();}}
    }
}
public class thrd1 {
    public static void main(String[] args)throws Exception{
      Boat b=new Boat();
      gfg a=new gfg();

            b.start();
            a.start();


    }
}
