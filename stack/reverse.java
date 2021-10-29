import java.util.Scanner;

public class reverse
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        stack1 s=new stack1(n);
        for (int i=0; i<n; i++)
        {
            s.push(str.charAt(i));
        }

        String ns = "";
        for(int i=0; i<n; i++)
        {
            ns+=s.pop();
        }
        System.out.println(ns+"\n");
        sc.close();
    }
}

class stack1 
{
    int top=-1;
    int max;
 //   char arr[];

    stack1(int n)
    {
        max=n;
       // arr=new char[max];
    }
    char arr[]=new char[max];
    void push(char s)
    {
        arr[++top]=s;
    }

    char pop()
    {
        return (char) arr[top--];
    }
}
