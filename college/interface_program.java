package college;


interface employee
{
    public void name();
    public void emp_id();
}

class manager implements employee
{

    private String Q_function,q_fication,manager_allowance,rank;

    public String getQ_function() {
        return Q_function;
    }

    public void setQ_function(String q_function) {
        Q_function = q_function;
    }

    public String getQ_fication() {
        return q_fication;
    }

    public void setQ_fication(String q_fication) {
        this.q_fication = q_fication;
    }

    public String getManager_allowance() {
        return manager_allowance;
    }

    public void setManager_allowance(String manager_allowance) {
        this.manager_allowance = manager_allowance;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public void name() {
        System.out.println("This is employee name ::");

    }

    @Override
    public void emp_id() {
        System.out.println("This is employee id ::");
    }
}

class  labour implements employee
{
    String dailywage,overtime,grade;

    public String getDailywage() {
        return dailywage;
    }

    public void setDailywage(String dailywage) {
        this.dailywage = dailywage;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public void name() {
        System.out.println("This is labour name ::");
    }

    @Override
    public void emp_id() {
        System.out.println("This is labour id");
    }
}
public class interface_program {
    public static void main(String[] args) {

    }
}
