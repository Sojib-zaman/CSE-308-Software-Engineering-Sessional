package problem_3;

import java.util.ArrayList;
import java.util.Iterator;

public class Company implements composite{
    ArrayList<Employee> Manager_employees = new ArrayList<>() ;
    String company_name ;
    public Company(String company_name)
    {
        this.company_name = company_name ;

    }
    public void addProjectManager(Employee employee)
    {
        Manager_employees.add(employee) ;
    }
    public void removeProjectManager(Employee employee) {
        // to remove the manager first remove the developers

        String M_name = employee.getName();
        for (int i = 0; i < Manager_employees.size(); i++) {
            Employee employee1 = Manager_employees.get(i);
            if (employee1.getName() == M_name) {
                employee1.removealldev();
                Manager_employees.remove(employee1);
            }
        }
    }
    public void printdescription() {
        //System.out.println("company_composite_hierarchy : ");
        System.out.println("    - " + company_name);
        Iterator iterator = Manager_employees.iterator();
        while (iterator.hasNext())
        {
            Employee manager = (Employee)iterator.next();
            manager.details();
        }
    }
    public String getCompany_name(){return company_name;}
    public void delete()
    {
        for(Employee p : Manager_employees)
        {
            p.removealldev();
        }
        Manager_employees.clear();


    }
}
