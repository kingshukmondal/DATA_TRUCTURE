import java.util.Scanner;
import java.util.Stack;

public class postifix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String exp=sc.nextLine();
        Stack<Character> st=new Stack<Character>();
        String post="";
        for(int i=0; i<exp.length(); i++) {
            char s=exp.charAt(i);
            if(Character.isLetter(s)) {
                post+=s;
            }
            else if(s=='(')
            {
                st.add('(');
            }
            else if(s==')')
            {
                while(st.peek()!=')')
                {   
                    post=post+st.peek();
                    st.pop();
                }            
                st.pop();
            }
            else
            {
                while(!st.isEmpty() && st.peek()!=')' && pre(s)<=pre(st.peek()))
                {
                    post+=st.peek();
                    st.pop();
                }
                st.push(s);
            
            }
        }
            while(!st.isEmpty()) {
                post=post+st.peek();
                st.pop();
            }

            System.out.println(post);
        
}
static int pre(char x)
{
    if(x=='+' || x=='-')
    {
        return 1;
    }
    if(x=='/' || x=='*' || x=='%')
    {
        return 2;
    }
    if(x=='^')
    {
        return 3;
    }
    return 0;
}
}
