import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class allrev {
    public static void main(String[] args) {
        Linkedlistnew list =new Linkedlistnew();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            int a=sc.nextInt();
            list.add(a);
        }
        reverse(list);


    }

    private static void reverse(Linkedlistnew list) {
        Stack<Node11> stack = new Stack<Node11>();
        Linkedlistnew list1 =new Linkedlistnew();
        Node11 s=list.ghead();
        while(s!=null) {
            stack.push(s);
            s=s.next;
        }
        System.out.println(stack);
        while(!stack.isEmpty()) {
           list1.create(stack.peek().data);
           stack.pop();
        }
        list1.display();
        list.display();

    }
}
