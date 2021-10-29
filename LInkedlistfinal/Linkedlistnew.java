import java.util.Stack;

public class Linkedlistnew
{
    Node11 head;

    void create(int data)
    {
        Node11 newNode = new Node11();
        newNode.data = data;
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node11 p=head;
        while(p.next != null)
        {
            p=p.next;
        }
        p.next = newNode;
    }

    void display()
    {
        if(head == null)
        {
            System.out.println("List is empty!!");
            return;
        }
        Node11 p=head;
        while(p.next!= null)
        {
            System.out.print(p.data+"-->");
            p=p.next;
        }
        System.out.print(p.data);
    }

    void add(int data)
    {
        Node11 newnode=new Node11(data);
        if(head==null)
        {
            head=newnode;
            return;
        }
        Node11 p=head;
        while(p.next!=null)
        {
            p=p.next;
        }
        p.next=newnode;
        
    }

    void insertatbeg(int data)
    {
        Node11 newnode=new Node11(data);
        newnode.data=data;
        if(head==null)
        {
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    void insertbefore(int num,int data)
    {
        Node11 newnode=new Node11(data);
        if(head==null)
        {
            System.out.println("The list is empty !!!");
            return;
        }
        else if(head.data==num)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        else
        {
        Node11 p=head;
        while(p.next!=null)
        {           
            if(p.next.data==num)
            {
                newnode.next=p.next;
                p.next=newnode;
                return;
            }
            p=p.next;
        }
        
    System.out.println("Not found!!"); 
    }
    }

    void insertafter(int num,int data)
    {
        if(head==null)
        {
            System.out.println("The list is empty!");
            return;
        }
        Node11 p=head;
        while(p.next!=null)
        {
            if(p.data==num){
                Node11 newnode=new Node11(data);
                newnode.next=p.next;
                p.next=newnode;
                return;
            }
            p=p.next;
        }
        if(p.data==num){
            Node11 newnode=new Node11(data);
            newnode.next=p.next;
            p.next=newnode;
            return;
        }
        System.out.println("Element not found1");
    }

    int count()
    {
        int count =0;
        if(head==null)
        {
            System.out.println("0");
            return 0;
        }
        Node11 p=head;
        while(p!= null)
        {
            count++; 
            p=p.next;
        }

        System.out.println(count);
        return count;
    }

    void search(int data)
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        Node11 p=head;
        int count=0;
        while(p!=null)
        {
            count++; 
            if(p.data==data)
            {
                System.out.println("Found  " + count);
                return;
            }
            p=p.next;
        }
        System.out.println("Not found!!");
    }

    void insertpos(int data,int pos)
    {
        Node11 newNode = new Node11(data);
        if(head == null)
        {
            System.out.println("The list is empty !");
            return;
        }
        int count =0;
        Node11 p=head;
        while(p != null)
        {
            count ++;
            if(count +1==pos)
            {
                newNode.next = p.next;
                p.next=newNode;
                return;
            }
            p=p.next;
        }
    }

    void deletefirst()
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        head = head.next;
    }

    void lastnode()
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        Node11 p=head;
        while(p.next!=null)
        {
            if(p.next.next==null)
            {
                p.next=null;
                return;
            }
            p=p.next;
        }
    }

    void particular(int data)
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        Node11 p=head;
        while(p!=null)
        {
            if(p.next.data==data)
            {
                p.next=p.next.next;
                break;
            }
            p=p.next;
        }
    }

    void reversal()
    {
       if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        Node11 p=head;
        Node11 n;
        Node11 prev=null;
        while(p!=null)
        {
            n=p.next;
            p.next=prev;
            prev=p;
            p=n;
        }
        prev=head;
    }

    Node11 ghead()
    {
        return head;
    }
    
    void selectiondata()
    {
        Node11 p;
        Node11 q;
        for(p=head; p.next!=null; p=p.next)
        {
            for(q=p.next;q!=null; q=q.next)
           {
                if(p.data>q.data)
                    {
                        int temp=p.data;
                        p.data=q.data;
                        q.data=temp;
                    }
            }
        }
        display();
    }

    void bubblesort()
    {
        int num=count();
        int i,j,k;
        Node11 start=head;
        Node11 p;
        Node11 q;
        int ex=0;
        for(i=0,p=start;i<num;i++,p=p.next)
        {
            for(j=0,q=p.next;j<num-i-1;j++,q=q.next)
            {
            if(p.data>q.data)
            {
                int temp=p.data;
                p.data=q.data;
                q.data=temp;
                ex++;
            }
        }
        if(ex==0)
        {
            System.out.println("The list is already sorted ");
            break;
        }
        } 
        display();
    }

    Node11 binarysearch(int key)
        {
            Node11 first=head;
            Node11 end=null;
            do
            {
                Node11 mid =middle(first,end);
    
                if(mid==null)
                    return null;
                if(mid.data == key)
                {
                    System.out.println("The node is present in the list");
                    return mid;
                }
                else if(mid.data>key)
                {
                    end=mid.next;     
                }
                if(mid.data<key)
                {
                    first=mid;
                }
    
            }while(end==null || end==first);
            return null;
        }
    
    Node11 middle(Node11 first, Node11 end) 
        {
            Node11 slow=first;
            Node11 fast=first.next;
            while(fast!=end)
            {
                fast=fast.next;
                if(fast!=end)
                {
                    first=fast.next;
                    slow=slow.next;
                }
            }
            return slow;
        }
    
}
