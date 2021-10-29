import java.util.Scanner;
class Node 
{
    int data;
    Node next;    
    Node prev;
}
 class dlist
{
    Node head;

    public void travere()
    {
        if(head == null)
        {
            return;
        }
        Node p;
        p=head;
        while(p.next!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
        System.out.println(p.data);
    }

    public void add(int data)
    {
        Node temp=new Node();
        if(head == null)
        {
            temp.data=data;
            temp.prev=null;
            head=temp;
            return;
        }
        Node p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        temp.data=data;
        temp.next=null;
        temp.prev=p;
        p.next=temp;
    }

    public void add1st(int data)
    {
        Node temp=new Node();
        temp.data=data;
        temp.prev=null;
        temp.next=head;
        head=temp; 
    }

    public void insertend(int data)
    {
        Node temp=new Node();
        if(head == null)
        {
            System.out.println("The list is empty ::");
            return;
        }
        Node p;
        p=head;
        while(p.next != null)
        {
            p=p.next;
        }
        temp.data=data;
        temp.next=null;
        temp.prev=p;
        p.next=temp;
    }

    public void addafterNode(int ele,int data)
    {
        Node temp=new Node();
        if(head==null)
        {
            System.out.println("List is empty!!");
            return;
        }

        Node p=head;
        while(p.next != null)
        {
            if(p.data==ele)
            {
                temp.data=data;
                temp.prev=p;
                temp.next=p.next;
                p.next.prev=temp;
                p.next=temp;
                return;
            }
            p=p.next;
        }
        if(p.data==ele)
        {
            temp.data=data;
            temp.prev=p;
            temp.next=p.next;
            p.next.prev=temp;
            p.next=temp;
            return;
        }
    }
}

public class dll {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        dlist list=new dlist();
        System.out.println("Enter your chooice!!");
        System.out.println("1. create");
        System.out.println("2. Insert at beg");
        System.out.println("3. Insert at end");
        System.out.println("4. Insert after a given number");
        System.out.println("5. print");
        System.out.println("9. Exit");
        while(true)
        {
            System.out.print("Enter your choice ::");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the number of nodes you want to insert");
                    int n=sc.nextInt();
                    for(int i=0; i<n; i++)
                    {
                        System.out.print("Node "+(i+1)+":");
                        int data=sc.nextInt();
                        list.add(data);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number you wan to insert");
                    {
                        int data=sc.nextInt();
                        list.add1st(data);
                    }
                    break;
                case 3:
                    System.out.println("Enter the number you wan to insert");
                    {
                        int data=sc.nextInt();
                        list.insertend(data);
                    }
                    break;
                case 4:
                    System.out.println("Enter the number after which you want to insert");
                   {
                        int ele=sc.nextInt();
                        System.out.println("Enter the data ::");
                        int data=sc.nextInt();
                        list.addafterNode(ele,data);  
                   }
                   break;


                case 5:
                   
                    break;


            }
        }
        
        
    }
    
}
