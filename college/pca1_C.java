package college;

import java.util.Scanner;
class students
{
  String name;
   String roll;
    int marks;

    void setDetails(String name ,String roll_no,int marks)
    {
        this.name=name;
        this.roll=roll_no;
        this.marks=marks;
    }

}
public class pca1_C {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        students[] arr =new students[4];
        int max=0;
        int p=0;
        for(int i=0;i<4;i++)
        {
            arr[i]=new students();
            System.out.println("Enter name of Student"+(i+1));
            String name =sc.next();
            System.out.println("Enter Roll of Student"+(i+1));
            String roll =sc.next();
            System.out.println("Enter marks of Student"+(i+1));
            int marks=sc.nextInt();
            arr[i].setDetails(name,roll,marks);
            if(marks>max)
            {
                max=marks;
                p=i;
            }
        }

        System.out.println("Name :"+arr[p].name);
        System.out.println("Marks :" +arr[p].marks);
        System.out.println("Roll no :"+arr[p].roll);








    }
}
