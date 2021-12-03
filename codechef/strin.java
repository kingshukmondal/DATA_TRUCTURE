import java.util.Scanner;


//145279886
public class strin {
    public static void main(String[] args) {
        try
        {
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String str1 = "", newstr = "";

            if (str.length() % 2 == 0) {
                for (int i = 0; i < str.length(); ) {
                    str1 = str.substring(i, i + 2);
                    newstr = newstr + largenum(str1);
                    i += 2;
                }
            } else {
                for (int i = 0; i < str.length() - 1; ) {
                    str1 = str.substring(i, i + 2);
                    newstr = newstr + largenum(str1);
                    i += 2;
                }
                newstr = newstr + str.charAt(str.length() - 1);
            }
            System.out.println(newstr);
        }
        finally {

        }

    }

    private static String largenum(String str) {
        int p=Integer.parseInt(str);
        int max=0;
        while (p!=0)
        {
            int rem=p%10;
            if(rem>max)
            {
                max=rem;
            }
            p=p/10;
        }
        String s=Integer.toString(max);
        return  s;
    }
}
