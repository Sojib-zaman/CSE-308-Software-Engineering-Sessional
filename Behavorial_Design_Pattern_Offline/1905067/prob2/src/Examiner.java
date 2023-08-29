import java.util.Random;

import static java.lang.Math.abs;

public class Examiner {
    Controller controller;
    String user = "Examiner";
    public Examiner(Controller controller) {
        this.controller=controller;

    }
    public void Recheck(int SID,int prev_marks)
    {
        System.out.println("The examiner is rechecking the marks now for student ID : "+SID) ;
        Random rd = new Random();
        int updated_marks;
        if(abs(rd.nextInt())%2==0) updated_marks=prev_marks;
        else updated_marks =  abs(90+rd.nextInt(10)); ;
        if(prev_marks!=updated_marks)
        {
            System.out.println("Updated Marks");
            controller.MarksToStudentsAndPublish(updated_marks , SID);
        }
        else
        {
            System.out.println("The marks is unchanged after recheck");
            controller.MarksToStudentsAndPublish(updated_marks , SID);
        }


    }
    public void sendMarks(int ara[])
    {
        System.out.println("Script Checking is done");
        System.out.println("Sending to the controller office");
        controller.MarksToController(ara);
    }
}
