import java.util.Scanner;

class  qnode
{
    int prio;
    int data;
    qnode next;
}

class pqueue
{
    qnode head;
    void ins(int data,int pr)
    {
        qnode newnode =new qnode();
        newnode.data=data;
        newnode.prio=pr;
        if(head==null)
        {
            head=newnode;
            return; 
        }
        if(pr<head.prio)
        {
            newnode.next=head;
            head=newnode;
            return;
        }
        qnode p=head;
        while(p.next !=null && p.next.prio<=pr)
            p = p.next;
            newnode.next = p.next;
            p.next = newnode;

    }

    void delete()
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        else
            head=head.next;
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("The list is empty !");
            return;
        }
        qnode p=head;
        while(p!=null)
        {
            System.out.println(p.prio+"-----"+p.data);
            p=p.next;
        }
    }
}
public class priorityqueue {
    public static void main(String[] args) {
        pqueue list=new pqueue();
        System.out.println("1.Insert");
        System.out.println("2. Delete");
        System.out.println("3. Display");
        System.out.println("4. Exit");
        System.out.println("Enter your choice ::");
        while(true)
        {
            Scanner sc=new Scanner(System.in);
            int n;
            n=sc.nextInt();
            switch(n)
            {
                case  1:
                    System.out.println("Data & priority ::");
                    int data= sc.nextInt();
                    int pr= sc.nextInt();
                    list.ins(data,pr);
                    break;
                case 2:
                    list.delete();
                    break;
                case 3:
                    list.display();
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("wrong choide  !!");
            }
            sc.close();
        }
       
    }
}
