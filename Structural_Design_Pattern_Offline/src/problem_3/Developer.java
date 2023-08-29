package problem_3;

public class Developer extends Employee{
    String dev_name ;
    String role ;
    String project_name ;

    public Developer(String name , String project)
    {
        dev_name = name ;
        role = "Developer" ;
        project_name = project ;
    }
    public String getName()
    {
        return dev_name ;
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
    public void setDev_name(String name ){dev_name = name ;}
    public void printdescription()
    {
        System.out.println("Developer_Component_details : ");
        System.out.println("Name : "+dev_name);
        System.out.println("Role : "+role);
        System.out.println("Current Project : "+project_name);
    }
    public void details()
    {
        System.out.println("            -"+dev_name);
    }
}
