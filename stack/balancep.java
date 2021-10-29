import java.util.Scanner;
import java.util.Stack;

class balancep {
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       String str=sc.nextLine();
       boolean ck=check(str);
       if(ck)
       {
           System.out.println("BAlanced exp");
       }
       else
       {
           System.out.println("Not a valid exp");
       }
       sc.close();
    }

    private static boolean check(String str) {
        Stack<Character> sta=new Stack<Character>();
        for(int i=0; i<str.length(); i++)
        {
            char p=str.charAt(i);
            if(p=='{' || p=='[' || p=='(')
            {
                sta.push(p);
            }
            if(p=='}' || p==']' || p==')')
            {
                if(sta.isEmpty())
                {
                    System.out.println("Right is more");
                    return false;
                }
                else
                {
                    char s=sta.peek();
                    sta.pop();
                    if(!match(s,p))
                    {
                        System.out.println("Mismatch paramter are"+s+"---"+p);
                        return false;
                    }
                }
            }
        }
        if(sta.isEmpty())
        {
            System.out.println("Balanced !!");
            return true;
        }
        else
        {
            System.out.println("The right is more !!");
            return false;
        }
    }

    private static boolean match(char s, char p) {
        if(s=='[' && p==']')
            return true;
        if(s=='(' && p==')')
            return true;
        if(s=='{' && p=='}')
            return true;
        return false;
    }
}
