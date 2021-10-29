import java.util.Scanner;
class queue
{
    static int max=15;
    int front =-1;
    int rear=-1;
    int  arr[]=new int[max];
    boolean isEmpty()
    {
        if(front ==-1 || front ==rear+1)
        {
            return true;
        }
        else
        {
            return false ;
        }
    }
    boolean isFull()
    {
        if(rear==max-1)
        {
            return true;
        }
        return false;}
    void push(int data)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return;
        }
        if(front ==-1)
        {
            front =0;
        }
        arr[++rear]=data;
    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        front =front+1;
    }

    void display()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    void peek()
    {
        
        if(isEmpty())
        {
            System.out.println("Queue is empty");
            return;
        }
        
            System.out.print(arr[rear]+"is the rear\n");
            System.out.print(arr[front]+"is the front\n");
    }
}
public class queuearray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        queue list=new queue();

        while(true) {
            System.out.println("\n1.Push\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT\n");
            System.out.println("Enter your choice !!!");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter the data to be inserted!!!");
                    int n=sc.nextInt();
                    list.push(n);
                    break;
                case 2:
                    list.pop();
                    break;
                case 3:
                    list.peek();
                    break;
                case 4:
                    list.display();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!!!");
            }
            sc.close();
        }
       
    }
}
