package learning;

public class hello2 {

    public static void main(String[] args)throws Exception {

        int a =10;
        int b=0;

        try {
            throw new ArrayIndexOutOfBoundsException ();
        } catch (ArithmeticException z) {
            System.out.println("Hello java1 ");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Java 3");
        }
    }
}
