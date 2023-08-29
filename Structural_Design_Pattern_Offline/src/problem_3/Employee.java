package problem_3;

public abstract class Employee implements composite {

    public void addDev(Employee employee) {
        throw new UnsupportedOperationException();
    }
    public void removeDev(Employee employee){throw new UnsupportedOperationException();}
    public void removealldev(){throw new UnsupportedOperationException();}
    public String getName()
    {
        throw new UnsupportedOperationException();
    }
    public String getRole()
    {
        throw new UnsupportedOperationException();
    }
    public String getProject_name()
    {
        throw new UnsupportedOperationException();
    }
    public void printdescription()
    {
        throw new UnsupportedOperationException();
    }
    public void details(){throw new UnsupportedOperationException();}

}
