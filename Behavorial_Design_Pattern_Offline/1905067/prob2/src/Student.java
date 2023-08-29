public class Student {
    Controller controller;
    public Student(Controller controller) {
        this.controller=controller;

    }
    public void receiveUpdatedMarksAndPublish(int marks , int SID)
    {
        // this should be done for each student
        System.out.println("From student id "+ SID + " ---- " +marks);


    }
    public void ReqForRecheck(int SID)
    {
        System.out.println("Student ID "+SID+" asked for a recheck");
        controller.StdAskedForRecheck(SID);

    }
}
