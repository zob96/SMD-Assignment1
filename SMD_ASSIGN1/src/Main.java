import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {



    public static void main(String args[])
    {

        Employee dev= new Developer(20);
        Employee dev2= new Developer(20);
        Employee terni1= new Intern(10);
        Employee pm1=new ProjectManager(25);

        Employee obj[]= new Employee[10];

       ArrayList<Employee> employees= new ArrayList<Employee>();

       employees.add(dev);
        employees.add(dev2);
        employees.add(terni1);
        employees.add(pm1);

        for(int i=0; i<employees.size(); i++)
        {
            employees.get(i).calculatePay();

        }


        dev.printBenefits();

    }

}
