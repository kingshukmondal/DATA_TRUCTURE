import java.util.Scanner;

class linku
{
    class Node 
    {
        int data;
        Node next;
    }

    Node head;
    void push(int data)
    {
        Node p=new Node();
        p.data = data;
        p.next = head;
        head=p;
    }

    void pop()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return;
        }
        else if(head.next==null)
        {
            head=null;
            return;
        }
        else 
        {
            System.out.println("The elements to be deleeted is :"+head.data);
            head=head.next;
        }
    }

    void peek()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return;
        }
        System.out.println("The element is::"+head.data);
        return;
    }

    void display()
    {
        if(head==null)
        {
            System.out.println("Stack is empty!!");
            return;
        }
        else 
        {
            Node p=head;
            while(p.next!=null)
            {
                System.out.print(p.data+" ");
                p=p.next;
            }
            System.out.println(p.data);

        }
    }

}
public class stacklinked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linku stack = new linku();
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
                    break;
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
