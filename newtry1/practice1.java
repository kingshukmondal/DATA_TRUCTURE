package newtry1;
interface  c1
{
    int a=10;
    void cantalk(int data);
    void can_play(int item);

    default void defclass()
    {
        System.out.println("Helo world");
    }
}
abstract class c2
{
    int a=10;

    abstract public void canSwim();

    void canrun() {
        System.out.println("can  swim");
    }
}
class c3 implements c1
{
    public void cantalk(int n)
    {
        System.out.println("c3 can talk");
    }

    @Override
    public void can_play(int item) {
        System.out.println("No item");
    }

    @Override
    public void defclass() {
        System.out.println("hello from class c3");
    }
}
class c4 extends c2
{

    @Override
    public void canSwim() {
        System.out.println("c4 cam swim");
    }

}
class car
{
    void canDrive()
    {
        System.out.println("car:The car can drive !!");
    }

    void canbBeRep()
    {
        System.out.println("car:The car can be repaired !!");
    }
}
class tata extends car
{
    void autoPilot()
    {
        System.out.println("tata:Cam support autopilot !!");
    }

    void hasAc()
    {
        System.out.println("tata:It has Ac");
    }

    @Override
    void canDrive()
    {
        System.out.println("Tata: can be driven");
    }
}


public class practice1 {
    public static void main(String[] args) {
        c3 obj=new c3();
        obj.can_play(10);
        obj.cantalk(20);
        obj.defclass();
        c4 obj1=new c4();
        System.out.println(obj1.a);
        obj1.canrun();
        obj1.canSwim();
        tata tea=new tata();
        tea.canDrive();
        tea.autoPilot();
        tea.hasAc();
        tea.canbBeRep();
    }
}
