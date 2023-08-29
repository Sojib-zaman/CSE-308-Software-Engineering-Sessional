package problem_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Client {
    public static final String ANSI_RESET = "\u001B[0m" ;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m" ;
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final  String ANSI_RED = "\u001B[31m";


    public static void showoption()
    {
        System.out.println("Choose options : ");
        System.out.println("1. Create a Company");
        System.out.println("2. Add New Project");
        System.out.println("3. Add develeopers ");
        System.out.println("4. Show Company information ");
        System.out.println("5. Show Project Manager Information");
        System.out.println("6. Remove Developer");
        System.out.println("7. Remove Project Manager");
        System.out.println("8. Delete company");
    }
    public static void main(String[] args) {

        int stop = 0 ;
        ArrayList<Company> companies = new ArrayList<>() ;
        ArrayList<ProjectManager> Managers = new ArrayList<>() ;
        Company company = null ;
        ProjectManager projectManager = null ;
        while (stop==0) {
            showoption();

            int option = 0;
            Scanner sc = new Scanner(System.in);
            try {
                option = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Thanks for using our service");
                stop=1 ;

            }
            sc.nextLine();
            if(stop==1)break;
            if (option == 1) {
                System.out.println("Enter the name of your company");
                String company_name = sc.nextLine();
                //System.out.println("COMPANY NAME : "+company_name);
                company = new Company(company_name);
                companies.add(company);

            } else if (option==2)
            {
                if(companies.size()==0) System.out.println(ANSI_RED+"Projects can't be created right now"+ANSI_RESET);
                else {

                    System.out.println("Enter the name of Project name");
                    String project_name = sc.nextLine();
                    System.out.println("Please assign a project manager ");
                    String manager = sc.nextLine();
                    projectManager = new ProjectManager(manager, project_name, company.getCompany_name());
                    // error check for first time add
                    company.addProjectManager(projectManager);
                    Managers.add(projectManager);
                }
            }
            else if(option==3)
            {
                //System.out.println("Enter the name of project u want a developer to assign");
                //String project_name = sc.nextLine() ;
                // search if that project exists , if not say create such project first

                if(Managers.size()==0 || companies.size()==0) System.out.println(ANSI_RED+"Devs can't be created right now"+ANSI_RESET);
                else
                {
                    System.out.println("Enter the name of developer");
                    String dev_name =sc.nextLine();
                    Developer dev = new Developer(dev_name , projectManager.getProject_name())  ;
                    projectManager.addDev(dev);

                }

            }
            else if(option==4)
            {
                if(companies.size()==0) {
                    System.out.println(ANSI_CYAN+"Please add a company."+ANSI_RESET);
                }
                else
                {
                    System.out.println("company_composite_hierarchy");
                    for(int i = 0 ; i<companies.size() ; i++ )
                    {
                        Company it = companies.get(i) ;
                        it.printdescription();

                    }
                }

            }
            else if(option==5) {
                if (Managers.size() != 0) {
                    System.out.println("Enter the project manager name to see information");
                    String manager = sc.nextLine();
                    for (int i = 0; i < Managers.size(); i++) {
                        ProjectManager it = Managers.get(i);
                        if (it.getName().equalsIgnoreCase(manager)) {
                            it.printdescription();
                        }

                    }
                } else {
                    System.out.println(ANSI_GREEN + "Currently we don't have any managers available" + ANSI_RESET);
                }


            }
            else if(option==6)
            {
                if(Managers.size()==0 || companies.size()==0) System.out.println(ANSI_RED+"Devs can't be removed right now"+ANSI_RESET);
                else
                {
                    System.out.println("Enter Developer name to remove");
                    String dev_name = sc.nextLine();
                    for(int j =0 ; j<Managers.size() ; j++)
                    {
                        ProjectManager p = Managers.get(j) ;
                        if(p.checkifunderhim(dev_name))
                        {
                            //System.out.println("yapp");
                            p.removeDev(dev_name);
                        }
                    }
                }


            }
            else if(option==7)
            {
                System.out.println("Enter Project manager name to remove");
                String manager = sc.nextLine();
                for(int i = 0 ; i<Managers.size() ; i++ ) {
                    ProjectManager it = Managers.get(i);
                    if(it.getName().equalsIgnoreCase(manager)) {
                        for(int j =0 ; j<companies.size() ; j++)
                        {
                            Company temp_company = companies.get(i) ;
                            if(temp_company.getCompany_name().equalsIgnoreCase(it.company_name))
                            {
                                temp_company.removeProjectManager(it);
                                Managers.remove(it) ;
                            }
                        }
                    }
                }
            }
            else if(option==8)
            {
                if(companies.size()==0) System.out.println(ANSI_RED+"Currently there is no available company"+ANSI_RESET);
                else
                {
                    System.out.println("Enter Company name to remove");
                    String company_name  = sc.nextLine();
                    for(int j =0 ; j<companies.size() ; j++)
                    {
                        Company x = companies.get(j) ;
                        if(x.getCompany_name().equalsIgnoreCase(company_name))
                        {
                            companies.remove(x) ;
                            x.delete();
                        }
                    }
                }

            }

        }
    }
}
