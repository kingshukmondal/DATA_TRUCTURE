package college;

import java.util.Scanner;

class stack {
    static int max=9999;
    int arr[]=new int[max];
    int top=-1;

    void push(int data)
    {
        if(top == max)
        {
            System.out.println("Stack is full!!");
            return;
        }

        else
        {
            arr[++top] = data;
        }
    }

    void pop()
    {
        if(top ==-1)
        {
            System.out.println("Stack is Empty!!");
            return;
        }
        else
        {
            System.out.println("the elements to be deleted is ::"+arr[top]);
            top=top-1;
        }
    }

    void peek()
    {
        if(top ==-1)
        {
            System.out.println("Stack is Empty!!");
            return;
        }
        else
        {
            System.out.println("the elements on top is  ::"+arr[top]);
        }
    }
    void display()
    {
        if(top ==-1)
        {
            System.out.println("Stack is Empty!!");
            return;
        }
        else
        {
            for(int i=top;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }

    boolean isEmpty()
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    int getSize()
    {
        return top;
    }

}
public class pca1_B {
    public static void main(String[] args) {
        stack st1=new stack();
        stack st2=new stack();
        Scanner sc=new Scanner(System.in);

        System.out.println("1. push in stack 1");
        System.out.println("2. push in stack 2");
        System.out.println("3. Pop in stack 1");
        System.out.println("4. Pop in stack 2");
        System.out.println("5. Check if stack 1 is empty");
        System.out.println("6. Check if stack 2 is empty");

        while (true)
        {

            System.out.println("ENTER YOUR CHOICE !!");
            int ch=sc.nextInt();

            switch(ch)
            {
                case 1:
                    int ele=sc.nextInt();
                    st1.push(ele);
                    if(st1.getSize()== st2.getSize())
                    {
                        System.out.print("The size is :");
                        System.out.println(st1.getSize());
                    }
                    break;
                case 2:
                    int ele1=sc.nextInt();
                    st2.push(ele1);
                    if(st1.getSize()== st2.getSize())
                    {
                        System.out.print("The size is :");
                        System.out.println(st1.getSize());
                    }
                    break;
                case 3:
                    st1.pop();
                    if(st1.getSize()== st2.getSize())
                    {
                        System.out.print("The size is :");
                        System.out.println(st1.getSize());
                    }
                    break;
                case 4:
                    st2.pop();
                    if(st1.getSize()== st2.getSize())
                    {
                        System.out.print("The size is :");
                        System.out.println(st1.getSize());
                    }
                    break;
                case 5:
                    System.out.println(st1.isEmpty());
                    break;
                case 6:
                    System.out.println(st2.isEmpty());
                    break;
                default:
                    System.out.println("Wrong choice !!");

            }

        }
    }
}
