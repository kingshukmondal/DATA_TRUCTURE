import java.util.Scanner;

class Queu
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
        p.data=data;
        if(head == null)
        {
            head=p;
            return;
        }
        Node q;
        q=head;
        while(q.next != null)
        {
            q=q.next;
        }
        q.next=p;
        p.next=null;
    }

    void pop()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head=head.next;
    }

    void peek()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node p=head;
        while(p.next != null)
        {
            p=p.next;
        }
        System.out.println(p.data);
    }

    void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node p=head;
        while(p.next != null)
        {
            System.out.print(p.data+"->");
            p=p.next;
            
        }
        System.out.println(p.data);
    }
}
    

public class queuelist {
    public static void main(String[] args) {
    Queu list=new Queu();
    System.out.println("\n1.Push\n2.POP\n3.PEEK\n4.DISPLAY\n5.EXIT\n");
    while(true) {
        Scanner sc=new Scanner(System.in);
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

