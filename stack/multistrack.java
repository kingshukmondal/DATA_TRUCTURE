import java.util.Scanner;

class multistrack {
    public static void main(String[] args) {
        mst st = new mst();
        Scanner sc = new Scanner(System.in);
        while (true)
        {
            int ch=sc.nextInt();
            switch (ch) {
                case 1 -> st.pushs1(sc.nextInt());
                case 2 -> st.push2(sc.nextInt());
                case 3 -> st.pop1();
                case 4 -> st.pop2();
                case 5 -> st.printS();
                case 6 -> st.prints2();
                case 7 -> System.exit(1);
            }
        }
    }
}
 class mst
{
    final int max=20;
    int arr[]=new int[max];
    int top1=-1;
    int top2=max;

    void pushs1(int data)
    {
        if(top1==top2-1)
        {
            System.out.println("The stack is full ");
            return;
        }
        else
        {
            arr[++top1]=data;
            return;
        }
    }

    void push2(int data)
    {
        if(top2-1==top1)
        {
            System.out.println("Stack is full");
            return;
        }
        else
        {
            arr[--top2]=data;
            return;
        }
    }

    void pop1()
    {
        if (top1==-1)
        {
            System.out.println("the stack is empty ");
            return;
        }
        else
        {
            --top1;
        }
    }

    void pop2()
    {
        if(top2==max)
        {
            System.out.println("The stack is empty");
            return;
        }
        ++top2;
    }

    void printS()
    {
        if(top1==-1)
        {
            System.out.println("the stack is empty ");
            return;
        }
        for(int i=top1;i>0;i--)
        {
            System.out.printf(String.valueOf(arr[i]));
        }
    }


    void prints2()
    {
        if(top2==max)
        {
            System.out.println("The  stack2 is empty");
            return;
        }
        for(int i=top2;i<=max;i++)
        {
            System.out.print(arr[i]);
        }
    }


}