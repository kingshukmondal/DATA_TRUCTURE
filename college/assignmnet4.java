package college;
abstract class Bank
{
  abstract void getRate();
}

class SBI extends Bank
{ @Override
    void getRate() {
        System.out.println("Rate :8.4%");
    }
}

class ICICI extends Bank
{ @Override
    void getRate() {
    System.out.println("Rate :7.3%");
    }
}

class AXIS extends Bank
{ @Override
    void getRate() {
        System.out.println("Rate :9.7%");
    }
}


public class assignmnet4 {
    public static void main(String[] args) {
        new AXIS().getRate();
        new ICICI().getRate();
        new SBI().getRate();
    }
}
