package PROJECTS;

import java.sql.*;
import java.util.Formatter;
import java.util.Scanner;

public class contact_management_sys {
    static Connection con=null;
    static Statement st;
    public static void main(String[] args) {
        try
        {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/king", "root", "root");
            st = con.createStatement();
            Scanner sc=new Scanner(System.in);
            while (true)
            {
                System.out.println("1.ADD\t 2.DELETE\t 3.SEARCH\t 4.EDIT\t 5.ALL");

                switch (sc.nextInt())
                {
                    case  1:// ADD Contacts
                        System.out.print("ENTER THE NAME ::");
                        sc.nextLine();
                        String name=sc.nextLine();
                        System.out.print("ENTER THE NUMBER ::");
                        String num=sc.nextLine();
                        addContact(name,num);
                        break;
                    case 2:
                        delete();
                        break;
                    case 3:
                        Search();
                        break;
                    case 4:
                        edit();
                        break;

                    case 5:
                        showAll();



                }

            }

        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }
    private static void delete() throws Exception {
        Search();
        System.out.println("Enter the id you want to Delete ::");
        int id=new Scanner(System.in).nextInt();
        String Query="Delete from contact where id="+id;
       st.executeUpdate(Query);
    }

    private  static void Search() throws Exception
    {
        System.out.print("Enter the name to be serched ::");
        String s=new Scanner(System.in).nextLine().toUpperCase();
        String Query="SELECT * FROM contact order by Name;";

        ResultSet rs=st.executeQuery(Query);
        System.out.println("/***************************/");
        Formatter f=new Formatter();
        f.format("%4s %15s %15s\n","ID","NAME","NUMBER");
        boolean flag=false;
        while (rs.next())
        {
            if(rs.getString(2).startsWith(s))
            {
                flag=true;
                f.format("%4s %15s %15s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
                Thread.sleep(700);
            }
        }
        if(!flag)
        {
            System.out.println("No Result found!!");
        }
        System.out.println(f);
        System.out.println("/***************************/");
    }

    private static void showAll() throws Exception{
        String Query="SELECT * FROM contact order by Name;";

        ResultSet rs=st.executeQuery(Query);
        System.out.println("/***************************/");
        Formatter f=new Formatter();
        f.format("%4s %15s %15s\n","ID","NAME","NUMBER");
        while (rs.next())
        {
            f.format("%4s %15s %15s\n",rs.getInt(1),rs.getString(2).toUpperCase(),rs.getString(3));
        }
        System.out.println(f);
        System.out.println("/***************************/");
    }

    private static void edit() throws Exception {
        System.out.println("Enter the  name to be deleted ::");
        Search();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id you want to edit ::");
        int s=new Scanner(System.in).nextInt();
        System.out.print("1.EDIT NAME \t 2.EDIT NUMBER\n");
        switch (sc.nextInt())
        {
            case 1: {
                System.out.print("Enter the name ::");
                sc.nextLine();
                String p = sc.nextLine();
                String sql = "UPDATE contact SET Name =? WHERE id=?";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, p);
                statement.setString(2, String.valueOf(s));
                statement.executeUpdate();
            }
                break;
            case 2:
                System.out.print("Enter the name ::");
                sc.nextLine();
                String p1=sc.nextLine();
                String sql = "UPDATE contact SET Number =? WHERE id=?";
                PreparedStatement statement = con.prepareStatement(sql);
                statement.setString(1, p1);
                statement.setString(2, String.valueOf(s));
                statement.executeUpdate();
                break;
            default:
                System.out.println("Wrong Choice!!");
        }

    }


    public static void addContact(String name, String number)
    {
        if(number.length()!=10)
        {
            System.out.println("Invalid number !!");
            return;
        }
        try
        {
            String s = "insert into contact(Name,Number) values('" + name.toUpperCase() + "','" + number + "')";
            st.executeUpdate(s);
        }
        catch (Exception E)
        {
            E.printStackTrace();
        }
    }
}
