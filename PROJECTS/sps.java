package PROJECTS;

import java.util.Random;
import java.util.Scanner;

public class sps {
    public static void main(String[] args) {
        try{
            System.out.println("<====CHOICE====>");
            System.out.println("0..STONE!!");
            System.out.println("1..PAPER!!");
            System.out.println("2..SCISSORS!!");
            stone s = new stone();
            Scanner sc = new Scanner(System.in);
            while (s.getpcount(3) && s.getccount(3)) {
                System.out.println();
                System.out.println("Computer won :" + s.ccount);
                System.out.println("User won :" + s.pcount);
                System.out.println();
                {
                    int num = sc.nextInt();
                    if (num > 2)
                        System.out.println("Wrong choice !!");
                    else {
                        s.getdata(num);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class stone
{
    public static int ccount =0;
    public static  int pcount=0;
    static int count =0;
    public boolean  getpcount(int n)
    {
        if(pcount ==n)
        {
            System.out.println("<==========FINALLY YOU WON============>");
            return false;
        }
        return true;
    }

    public boolean  getccount(int n)
    {
        if(ccount ==n)
        {
            System.out.println("<==========FINALLY COMPUTER WON============>");
            return false;
        }
        return true;
    }
    /*  0.Stone
        1. paper
        2. Scissor

        stone with paper- win;
        .//\
     */
    public boolean getdata(int s)
    {
        Random rand=new Random();
        int def= rand.nextInt(2);
        System.out.print("Computer choose :");

        if(def==s)
        {
            System.out.println("Draw!!");
            return true;
        }
        else
        {
            if((def ==1 && s==0) || (def ==2 && s==1) || (def==0 && s==2))
            {
                ccount++;
                System.out.println("Computer won !!  ||");
            }
            else
            {
                pcount++;
                System.out.println("You won   ||");
            }
        }
        return true;
    }
}
