import java.util.Scanner;

public class bubblesortdata {
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
        int num=arr.count();
        int i,j;
        Node11 start=arr.ghead();
        Node11 p;
        Node11 q;
        int ex=0;
        for(i=0,p=start;i<num;i++,p=p.next)
        {
            for(j=0,q=p.next;j<n-i-1;j++,q=q.next)
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
        arr.display();
        sc.close();
    }
}
