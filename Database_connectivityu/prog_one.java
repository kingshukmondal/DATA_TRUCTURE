package Database_connectivityu;
import  java.sql.*;
import java.util.Scanner;

public class prog_one {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Connection  con=DriverManager.getConnection(",oZ","root","root");
        Statement st=con.createStatement();
        ResultSet rs =st.executeQuery("select * from emp");

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the name");
            String name= sc.next();

            System.out.println("Enter the number ");
            String num=sc.next();

            String s="insert into emp values('"+name+"','"+num+"')";
            st.executeUpdate(s);
        rs =st.executeQuery("select * from emp");
        while (rs.next())
        {
            System.out.println(rs.getString(1)+" "+rs.getString(2));
        }
        rs.close();
        con.close();


    }
}
