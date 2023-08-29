import java.util.Random ;
import java.lang.Math ;
import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.System.exit;

public class Client {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Examiner examiner = new Examiner(controller);
        Student[] student ;
        student=new Student[5];

        controller.setStudent(student);
        for(int i=0 ; i<5 ; i++)
            student[i]  = new Student(controller);

        int Ex_marks[] ;
        Ex_marks = new int [5] ;
        Random rd = new Random();
        //examiner giving marks
        for(int i=0 ; i<5 ; i++)
            Ex_marks[i] = abs(90+rd.nextInt(10)) ;

        //now send this number to controller
        examiner.sendMarks(Ex_marks);
        while (true)
        {
            System.out.println("Enter a number from 1-5 if you want to recheck");
            Scanner scanner = new Scanner(System.in) ;
            try {
                int recheck = scanner.nextInt();
                if(recheck<=5 && recheck>0)
                {
                    student[recheck-1].ReqForRecheck(recheck);
                }
            }
            catch (Exception E)
            {
                exit(0);}

        }




    }
}
