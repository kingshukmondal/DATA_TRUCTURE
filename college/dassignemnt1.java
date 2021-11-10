package college;
abstract class vehicle
{
    abstract void Engine();
}


class car extends vehicle
{

    @Override
    void Engine() {
        System.out.println("Car has  a good Engine !!");
    }
}


class truck extends vehicle
{

    @Override
    void Engine() {
        System.out.println("truck has  a bad Engine !!");
    }
}
public class dassignemnt1 {
    public static void main(String[] args) {
        new car().Engine();
        new truck().Engine();

    }
}
