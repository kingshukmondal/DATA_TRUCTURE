package college;
abstract class A
{
    abstract void meth1();
}

class B extends A
{
    @Override
    void meth1() {
        System.out.println("Call me from B");
    }
}
class dassignemnmt2 {
    public static void main(String[] args) {
        new B().meth1();
    }
}
