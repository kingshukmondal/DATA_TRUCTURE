import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlistnew arr=new Linkedlistnew();
        System.out.println("Enter the number of nodes ::");
        int n=sc.nextInt();
        for(int i=0; i<n; i++) 
        {
            arr.create(sc.nextInt());
        }
        arr.display();
        System.out.println();
        Node11 start=arr.ghead();
        Node11 p;
        Node11 q;
        for(p=start; p.next!=null; p=p.next)
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

        System.out.println("the sorted arr is ::");
        arr.display();
    }
}
