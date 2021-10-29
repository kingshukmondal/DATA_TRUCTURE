import java.util.Scanner;

class A
{
    private int z;

    void setZ(int a)
    {
        z=a;
    }
    int getZ()
    {
        return z;
    }


}
class Codecef1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();

        int str3=Integer.parseInt(str1)+Integer.parseInt(str2);
        System.out.println(str3);
    }
}