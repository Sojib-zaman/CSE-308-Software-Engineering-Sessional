import java.util.Random;

import static java.lang.Math.abs;

public class Controller implements ExamMediator {
    String event_title ;
    // they are can be some strings about events
    Student[] student ;
    int Con_marks[] ;
    //student array needed ??
    Examiner examiner;
    Controller()
    {

        examiner = new Examiner(this) ;

    }
    public void setStudent(Student[] student)
    {
        this.student = student;

    }

    public void MarksToController( int[] Ex_marks)
    {
        System.out.println("Contoller Received the marks ");
        System.out.println("Student ID ------ Marks");
        for(int i=0 ; i<Ex_marks.length ; i++)
            System.out.println(i+1+"                 "+Ex_marks[i]);



        Con_marks = new int [Ex_marks.length] ;
        Random rd = new Random();

        //Controller giving marks
        System.out.println("After Scrutinize : ");
        for(int i=0 ; i<Ex_marks.length ; i++)
        {
            if(abs(rd.nextInt())%2==0)
                Con_marks[i] = abs(90+rd.nextInt(10));
            else Con_marks[i] = Ex_marks[i];
        }

        System.out.println("Student ID------Previous Marks------New Marks");
        for(int i=0 ; i<Ex_marks.length ; i++)
        {
            if(Ex_marks[i]!=Con_marks[i]) System.out.println(i+1+"               "+Ex_marks[i] + "                  "+Con_marks[i]);
        }
        System.out.println("Marks is now received by students " );
        for(int i=0 ; i<Ex_marks.length ; i++)
            MarksToStudentsAndPublish(Con_marks[i] , i+1);

    }

    public void MarksToStudentsAndPublish(int marks , int SID)
    {

        student[SID-1].receiveUpdatedMarksAndPublish(marks , SID);
    }

    public void StdAskedForRecheck(int SID)
    {
        System.out.println("Sending the marks to the examiner to recheck");
        examiner.Recheck(SID,Con_marks[SID-1]);
    }


}
