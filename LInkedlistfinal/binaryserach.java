import java.util.Scanner;

public class binaryserach {
    static Linkedlistnew arr=new Linkedlistnew();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes ::");
        int n=sc.nextInt();
        for(int i=0; i<n; i++) 
        {
            arr.create(sc.nextInt());
        }
        arr.display();
        System.out.println();
        System.out.println("Enter the data to searched");
        int key=sc.nextInt();
        Node11 head=arr.ghead();
        search(key,head);
        
        sc.close();
    }


    static Node11 search(int key, Node11 head)
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


    private static Node11 middle(Node11 first, Node11 end) 
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
