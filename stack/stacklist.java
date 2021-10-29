import java.util.Scanner;
class stack {
   static int max;
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

}
public class stacklist {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack stack=new stack();
        while(true)
        {
            System.out.println("\n1.push\n2.pop\n3.peek\n4.Dislay\n5.Exit" );
            System.out.println("Enter your choice ::");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    int data=sc.nextInt();
                    stack.push(data);
                    break;

                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.peek();
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.exit(0);

                default:
                    System.out.println("Wrong choice!");
            }
        
        }
        
    }
}
