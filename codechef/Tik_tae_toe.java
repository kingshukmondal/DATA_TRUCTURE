import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Tik_tae_toe {
    static char[][] arr =new char[3][3];
    static int  chcker[]=new int[9];
    static char s;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Arrays.fill(chcker,-1);
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=' ';
            }
        }

        printArr(arr);
        System.out.println("**************************");
        System.out.println("0->00\t1->01\t2->02");
        System.out.println("3->10\t4->11\t5->12");
        System.out.println("6->20\t7->21\t8->22");
        System.out.println("**************************");
        while (!winCase(arr))
        {
            System.out.println();
            System.out.print("Enter the value :");
            int p=sc.nextInt();
            if(p>=9 || !isAvailable(chcker,p))
            {
                if(!isAvailable(chcker,p) && p<=8)
                {
                    System.out.println("The space is occupied !!");
                }
                System.out.println("Wrong choice !!");
                continue;
            }
            else
            {
                setArray(p,'X');
                if(checkone()<2)
                {
                    System.out.println("Draw");
                    printArr(arr);
                    break;
                }
                if(!winCase(arr))
                {
                    while (true)
                    {
                        Random rand=new Random();
                        int ze= rand.nextInt(9);
                        if(isAvailable(chcker,ze))
                        {
                            setArray(ze,'0');
                            break;
                        }
                    }
                }
            }

            printArr(arr);
        }
        System.out.println(s);
    }

    public static int checkone()
    {
        int count=0;
        for(int i=0;i<=8;i++)
        {
            if(chcker[i]==-1)
            {
                count++;
            }
        }
        return count;
    }
    public static void setArray(int p,char x)
    {
        chcker[p]=0;
        char X=x;
        switch (p)
        {
            case 0->steval(0,0,X);
            case 1->steval(0,1,X);
            case 2->steval(0,2,X);
            case 3->steval(1,0,X);
            case 4->steval(1,1,X);
            case 5->steval(1,2,X);
            case 6->steval(2,0,X);
            case 7->steval(2,1,X);
            case 8->steval(2,2,X);
        }
    }
    private static void steval(int i, int j,char x)
    {
        arr[i][j]=x;
    }

    public static void printArr(char arr[][])
    {
        System.out.println("************");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.printf(" %c |",arr[i][j]);
            }
            System.out.print("\b");
            System.out.println();
            if(i!=2)
            {
                System.out.println(" _ * _ * _  ");
            }
        }
        System.out.println("************");;
    }

    public static boolean isAvailable(int checker[],int val)
    {
        if(val<=8)
        {
            if (checker[val] == -1) {
                return true;
            }
        }
        return false;
    }

    public static boolean winCase(char arr[][])
    {
            if (arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2] && arr[0][1] !=' ') {
                s = arr[0][1];
                return true;
            }
            else if (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][1] !=' ') {
                s = arr[1][1];
                return true;
            }
            else if (arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2] && arr[2][1] !=' ') {
                s = arr[2][1];
                return true;
            }
            else if (arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0] && arr[0][0] !=' ') {
                s = arr[0][0];
                return true;
            }
            else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[1][2] && arr[1][1] !=' ') {
                s = arr[1][1];
                return true;
            }

            else if (arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2] && arr[1][2] !=' ') {
            s = arr[1][1];
            return true;
             }
            else if (arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2] && arr[1][1] !=' ') {
             s = arr[1][1];
               return true;
             }
            else if (arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0] && arr[1][1] !=' ') {
              s = arr[1][1];
               return true;
             }

        else
            return false;
    }
}

