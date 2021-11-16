package learning;
import  java.sql.*;
public class string_practice
{
    static {
       String [] he={"java","is","fun"};
       string_practice.main(he);
   }
    public static void main(String[] args) {
        for(int i=0;i<args.length;i++)
        {
            System.out.println(args[i]);
        }
    }
}

class javaone
{
    public static void main(String[] args) {
        String [] he={"java","is","fun"};
        string_practice.main(he);
    }
}
