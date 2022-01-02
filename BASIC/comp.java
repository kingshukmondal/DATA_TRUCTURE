package BASIC;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class students
{
    public students(String name, int roll_no, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
    }

    String name;
    int roll_no;
    int marks;
    
}
public class comp 
{
    static class compe implements Comparator<students>
    {
        @Override
        public int compare(students o1, students o2) {
            if(o1.roll_no> o2.roll_no)
                return 1;
            return -1;
        }
    }

    public static void main(String[] args) {
        ArrayList<students> ar = new ArrayList<students>();
        students t = new students("king", 43, 2);
        ar.add(t);
        ar.add(new students("raja", 65, 55));
        ar.add(new students("pretam", 11, 56));

        Comparator<students> co=new compe();
        Collections.sort(ar,co);
        for(int i=0;i<ar.size();i++)
        {
            students p=ar.get(i);
            System.out.println(p.name+ "  "+p.roll_no+" "+p.marks);
        }
    }


}
