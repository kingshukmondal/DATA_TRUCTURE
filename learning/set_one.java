package learning;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
class hello
{
    public void hello1(hello s)
    {
        System.out.println("hello java");
    }

    public void master()
    {
        hello1(this);
    }
}
public class set_one {
    public static void main(String[] args) {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);

            try {
                for(int i=0;i<5;i++)
                    arr[i]=sc.nextInt();
            } catch (Exception e) {
                System.out.println("Errror!!");
                System.out.println(e.getMessage());
            }

       finally {
                System.out.println("Dhamnna sohome");
            }
        }

    }


/**
 *
 * parent p=new child();
 * child p=new child();
 *
 */
