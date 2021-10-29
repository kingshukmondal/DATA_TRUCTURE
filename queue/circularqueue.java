import java.util.Scanner;

class cqueue
{
    static int max=12;
    int arr[]=new int[max];
    int f=-1;
    int r=-1;

    boolean isFull()
    {
        if(r==max-1)
        {
            return true;
        }
        return false;
    }


    boolean isEmpty()
    {
        if(f==0 && r==max-1 || f==r+1) 
        {
            return true;
        }
        return false;
    }
    void push(int data)
    {
        if(isFull())
        {
            System.out.println("queue overflow");
            return;
        }
        if(f ==-1)
            f =0;
        if(r==max-1)
            r=0;
        else 
            ++r;
        arr[r] = data;
    }

    void pop()
    {
        if(isEmpty())
        {
            System.out.println("queue underflow");
            return;
        }

        if(f==r)
        {
            f=-1;
            r=-1;
        }
        else if(f==max-1)
        {
            f=0;
        }
        else
            f=f+1;
    }

    void display()
    {
        int i=f;
        if(f<=r)
        {
            while(i<=r)
            {
                System.out.print(arr[i++]+" ");
            }
        }
        else
        {
            while(i<=max-1)
            {
                System.out.print(arr[i++]+" ");
            }
            i=0;
            {
                while(i<r)
                {
                    System.out.print(arr[i++]+" ");
                }
            }
        }
        System.out.println("");
    }
    
}
class circularqueue 
{
    public static void main(String[] args) {
        cqueue queue=new cqueue();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n1.Push\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT\n");
        while(true) {
            System.out.println("Enter your choice ");
            int ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Enter the data::::");
                    int data=sc.nextInt();
                    queue.push(data);
                    break;
                case 2:
                    queue.pop();
                    break;
                case 3:
                    queue.pop();
                    break;
                case 4:
                    queue.display();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Wrong choice !!!"); 
            }
            sc.close();

        }
    }
}