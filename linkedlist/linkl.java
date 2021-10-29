import java.util.Scanner;
import java.util.Stack;


class linkedll
{
class Node
{
    int data;
    Node next;
}

        Node head;

        public void insert(int data)
    {
        Node node=new Node();
        node.data = data;
        node.next = null;
        if(head==null)
        {
        head=node;
        }
        else 
        {
            Node n;
            n=head;
            while(n.next!=null)
            {
                n=n.next;
            }
            n.next=node;
        }
    }
                                          
        public void insertAtbeginning(int data)
    {
        Node node=new Node();
        node.data = data;
        node.next = head;
        head=node;
    }

        public void show()
        {
        if(head==null)
        {
            System.out.println("Empty list");
            return;
        }
        else
        {
        Node n=head;
        while(n.next!=null)
        {
            System.out.print(n.data+"-->");
            n=n.next;
        }
        System.out.println(n.data);
            }
        }

        public void search(int ele)
        {
            Node k=head;
            int i=0;
            while(k.next!=null)
            {
                if(k.data==ele)
                {
                    System.out.println("The searched element is found at position "+i);
                    return;
                }
                k=k.next;
                i++;
            }
            if(k.data==ele)
            {
                System.out.println("The searched element is found at position "+i);
                return;
            }
            System.out.println("The element is not found");
        }
    
        public void insertbefore(int data,int number){
            Node newnode=new Node();
            newnode.data=data;
            newnode.next= null;
            Node p;
            p=head;
            while(p.next!=null)
            {
                if(p.data==number)
                {
                    newnode.next=p.next;
                    p.next=newnode;
                    return;
                }
                p=p.next;
            }
            if(p.data==number)
                {
                    newnode.next=p.next;
                    p.next=newnode;
                    return;
                }
            else
            {
                System.out.println("Element not forund");
            }
        }

        public void insertafter(int data,int pos) {
            if(head==null)
            {
                System.out.println("list is empty");
                return;
            }
            Node newnode=new Node();
            newnode.data=data;
            newnode.next=null;


            if(pos==head.data)
            {
                newnode.next=head;
                head=newnode;
                return;
            }

            Node p;
            p=head;
            while(p.next!=null)
            {
                if(p.next.data==pos)
                {
                    newnode.next=p.next;
                    p.next=newnode;
                    return;
                }
                p=p.next;
            }
            System.out.println("The element is not in the list");
            return;
        }
   
        public void del1()
        {
            if(head==null)
            {
                System.out.println("List is empty");
                return;
            }
            head=head.next;
        }

        public void dellast(){
            if(head==null)
            {
                System.out.println("List is empty");
                return;
            }
            if(head.next==null)
            {
                head=head.next;
                return;
            }
            Node p=head;
            while(p.next.next!=null)
            {
                p=p.next;
            }
            p.next=null;
        }
   
        public void deleteanode(int key)
        {
            Node temp = head, prev = null;

            if (temp != null && temp.data == key) {
                head = temp.next;
                return;
            }
            while (temp != null && temp.data != key) {
                prev = temp;
                temp = temp.next;
            }
    
            if (temp == null)
                return;

            prev.next = temp.next;
        }
     
        public void reverse()
        {
            Node p;
            Node prev;
            Node next;
            p=head;
            prev=null;
            while(p != null)
            {
               next=p.next;
               p.next=prev;
               prev=p;
               p=next;
            }
            head=prev;
        }

        Node reverseList()
        {
            if(head==null)
            {
                return null;
            }
            if(head.next==null)
            {
                return head;
            }
            
            Stack<Node> s=new Stack<>();
           Node
            p=head;
           while(p.next!=null)
           {
               s.push(p);
               p=p.next;
           }
           head=p;
           while(!s.isEmpty())
           {
               Node a=s.peek();
               p.next=a;
               s.pop();
               p=p.next;
           }
           p.next=null;
           return head;
        }



        public void seelection()
        {
            if (head == null)
            {
                System.out.println("The list is empty");
                return;
            }

            Node p,q;
            p=head;
            for( p=head;p.next != null;p=p.next)
            {
                for(q=p.next;q != null;q=q.next)
                {
                    if(p.data>q.data)
                    {
                        int temp=q.data;
                        q.data=p.data;
                        p.data=temp;
                    }
                }

            }
        }
                                                                                                                }

    




public class linkl {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        linkedll list =new linkedll();
        
        System.out.println("\n\nlinked List");
            System.out.println("*-----------*");
            System.out.println("1. creating a list \n2. searching in a list \n3.print the list \n4. exit \n5.Insert at beginning \n6.Inssert before a node \n7.Insert after a node ");
            System.out.println("8.Delete at the beginning");
            System.out.println("9.Delete at the end");
            System.out.println("10.Delete a node");
            System.out.println("11.Reverse");
            System.out.println("12.Selection sort");
            System.out.println("");
        while(true)
        {
            System.out.println("Enter your choice :");
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the number of nodes you what in the list");
                    int n=sc.nextInt();
                    for(int i=0; i<n; i++)
                    {
                        System.out.print("Enter node "+ i+" :");
                        int k=sc.nextInt();
                        list.insert(k);
                    }
                    break;
                case 2:
                    System.out.println("Enter the element you want to search :");
                    int se=sc.nextInt();
                    list.search(se);
                    break;
                case 3:
                    list.show();
                    break;
                case 4:
                    System.exit(0);
                case 5:
                    int data=sc.nextInt();
                    list.insertAtbeginning(data);
                    break;
                case 6:
                    System.out.println("Enter the number you want to insert :");
                    int d=sc.nextInt();
                    System.out.println("Enter the number after which you want to insert");
                    int number=sc.nextInt();
                    list.insertbefore(d,number);
                    break;
                case 7:
                    System.out.println("Enter the number yoi want to insert :");
                    int dat=sc.nextInt();
                    System.out.println("Enter the number before which you want to insert");
                    int pos=sc.nextInt();
                    list.insertafter(dat,pos);
                    break;
                case 8:
                    list.del1();
                    break;
                case 9:
                    list.dellast();
                    break;
                case 10:
                    System.out.println("Enter the node which you want to delete");
                    int ele =sc.nextInt();
                    list.deleteanode(ele);
                    break;
                case 11:
                    list.reverseList();
                    list.show();
                    break; 
                case 12:
                    list.seelection();
                    list.show();
                    break; 

                default:
                    System.out.println("Sorry!! wrong choice !!");
            }
        }
    }
    
}
