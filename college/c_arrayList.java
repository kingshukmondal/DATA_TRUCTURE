package college;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class c_arrayList {
    public static void main(String[] args) {
        Employee ad=new Employee();
        ad.getDetails("King",1,10);
        ad.getDetails("Shreya",2,2);
        ad.getDetails("pratim",3,5);

    }
}
class Employee
{
    ArrayList<Details> arr=new ArrayList<>();


    void getDetails(String name,int id, int cite)
    {
        arr.add(new Details(name, id, cite));
    }


}

class Details
{
    String name;

    public Details(String name, int id, int cite) {
        this.name = name;
        this.id = id;
        this.cite = cite;
    }

    int id;

    public int getCite() {
        return cite;
    }

    int cite;

}