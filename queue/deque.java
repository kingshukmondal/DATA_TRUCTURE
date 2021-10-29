import java.util.Scanner;

class dque
{
    static int max=15;
    int arr[]=new int[max];
    int front =-1;
    int rear =-1;


    boolean isfull() 
    {
        if(front ==0 && rear == max-1 || front ==max+1)
            return true;
            return false;
    }

    boolean isempty() 
    {
        if(front ==-1)
        return true;
        return false;
    }
    void ifront(int data)
    {
        if(isfull())
        {
            System.out.println("The queue is full ");
            return;
        }
        if(front ==-1)
        {
            front =0;
            rear=0;
        } 
        else if(front==0)
        {
            front =max-1;
        }
        else 
        {
            front =front-1;
        }
        arr[front]=data;
    }



    void irear(int data)
    {
        if(isempty())
        {
            System.out.println("The queue is empty");
            return;
        }
        if(rear==max-1)
        {
            rear=0;
        }
        else if(front ==-1)
        {
            front =0;
            rear=0;
        }
        else
        {
            rear=rear+1;
        }
        arr[rear]=data;
    }

    void drear()
    {
        if(isempty())
        {
            System.out.println("The queue is empty");
            return;
        }
        if(front ==rear)
        {
            front =-1;
            rear=-1;
        }
        else 
            if(rear==0)
            {
                rear=max-1;
            }
            else
            {
                rear=rear-1;
            }
    }

    void dfront()
    {
        if(isempty())
        {
            System.out.println("The queue is empty");
            return;
        }
        else if(front ==-rear)
        {
            front =-1;
            rear=-1;
        }
        else if(front==max-1)
        {
            front =0;
        }
        else 
        {
            front =front+1;
        }
    }

    void show()
    {
        if(isempty())
        {
            System.out.println("The queue is empty");
            return;
        }

        int i=front;
        if(front <=rear)
        {
            while(i<=rear)
            {
                System.out.println(arr[i++]);
            }
        }
        else
        {
            while(i<=max-1)
            {
                System.out.println(arr[i++]);
            }
            i=0;
            while(i<=rear)
            {
                System.out.println(arr[i++]);
            }
        }

    }
    
}
public class deque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.INSSERTY AT FRONT\n 2. Insert at end \n3. Delete at front\n 4.delete at end\n 5. display ");
            System.out.println("Enter your choice ::");
            int ch=sc.nextInt();
            dque list=new dque();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the data ::");
                    int data=sc.nextInt();
                   list.ifront(data);
                    break;
                case 2:
                    System.out.println("Enter the data ::");
                    int data1=sc.nextInt();
                    list.irear(data1);
                    break;   
                case 3:
                    list.dfront();
                    break;
                case 4:
                    list.drear();
                    break;
                case 5:
                    list.show();
                    break;
                case 6:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Wrong choice!0");
            }
            sc.close();
        }
    }
}
