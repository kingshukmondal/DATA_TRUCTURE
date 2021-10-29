import java.util.Scanner;

public class merging {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Linkedlistnew l1=new Linkedlistnew();
        Linkedlistnew l2=new Linkedlistnew();
        Linkedlistnew fin=new Linkedlistnew();
        System.out.println("Enter list one --");
        System.out.println("-------");
        System.out.println("Enter the number of nodes ");
        int n1=sc.nextInt();
        for(int i=0; i<n1; i++) {
            l1.add(sc.nextInt());
        }

        System.out.println("Enter list two --");
        System.out.println("-------");
        System.out.println("Enter the number of nodes ");
        int n2=sc.nextInt();
        for(int i=0; i<n2; i++) {
            l2.add(sc.nextInt());
        }

        Node11 a=l1.ghead();
        Node11 b=l2.ghead();
        while(a!=null && b!=null)
        {
            if(a.data == b.data)
            {
                fin.add(a.data);
                a=a.next;
                b=b.next;
            }
            else if(a.data < b.data)
            {
                fin.add(a.data);
                a=a.next;
            }
            else if(b.data < a.data)
            {
                fin.add(b.data);
                b=b.next;
            }
            fin.display();
            System.out.println();
        }

    while(a!= null)
    {
        fin.add(a.data);
        a=a.next;
    }
    while(b!=null)
    {
        fin.add(b.data);
        b=b.next;
    }

    fin.display();
    sc.close();
    }
}
