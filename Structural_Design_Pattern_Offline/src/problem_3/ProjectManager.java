package problem_3;

import java.util.ArrayList;

public class ProjectManager extends Employee {
    ArrayList<Employee> devs = new ArrayList<>() ;
    String manager_name ;
    public String company_name ;
    String project_name ;
    String role = "Project Manager" ;
    int no_of_devs_under_him ;

    public ProjectManager(String name , String project_name , String company_name)
    {
        manager_name = name ;
        this.project_name = project_name ;
        this.company_name = company_name ;

    }
    public void addDev(Employee employee)
    {
        devs.add(employee) ;
        no_of_devs_under_him++ ;
    }
    public void removeDev(String name)
    {
        String d_name = name ;
        for(int i=0 ; i<devs.size() ; i++)
        {
            Employee employee1 = devs.get(i) ;
            if(employee1.getName().equalsIgnoreCase(name))
            {
                devs.remove(employee1);
                no_of_devs_under_him--;
            }
        }
    }
    public void removealldev()
    {
        devs.clear();
    }
    public String getName()
    {
        return manager_name ;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }
    public void setManager_name(String name ){manager_name = name ;}
    public void printdescription()
    {
        System.out.println("manager_component_details : ");
        System.out.println("Name : "+manager_name);
        System.out.println("Role : "+role);
        System.out.println("Current Project : "+project_name);
        System.out.println("Number of Supervisees: "+no_of_devs_under_him);
    }
    public void details()
    {
        System.out.println("     - "+manager_name+ "  ("+project_name+")");
        for(int i = 0 ; i<devs.size() ; i++)
        {
            devs.get(i).details();
        }
    }
    public boolean checkifunderhim(String name)
    {
        for(int i=0 ; i<devs.size() ; i++)
        {
            if(devs.get(i).getName().equalsIgnoreCase(name))
                return  true;

        }
        return false;
    }


}
