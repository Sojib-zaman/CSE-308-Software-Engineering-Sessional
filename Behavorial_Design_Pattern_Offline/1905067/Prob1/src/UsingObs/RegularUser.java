package UsingObs;

import UsingObs.ABC_Server;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class RegularUser implements Observer , User {
    int val = 400 ;
    Observable observable;
    boolean payingUser=true;
    public RegularUser(Observable observable)
    {
        this.observable = observable;
        observable.addObserver(this);
    }
    @Override
    public void update(Observable obj, Object arg) {

        if(obj instanceof ABC_Server)
        {
            ABC_Server server = (ABC_Server) obj ;
            int previous_state = server.getPrev_state();
            int current_state = server.getCurrent_state() ;

            //now depending on this both values , print
            displayMessage(previous_state,current_state);
        }
    }

    private void displayMessage(int previous_state, int current_state) {
        if(previous_state==0 && current_state==1) OPERATIONAL_to_PARTIALLYDOWN();
        else if(previous_state==0 && current_state==2) OPERATIONAL_to_FULLDOWN();
        else if(previous_state==1 && current_state==2) PARTIALLYDOWN_to_FULLDOWN();
        else if(previous_state==1 && current_state==0) PARTIALLYDOWN_to_OPERATIONAL();
        else if(previous_state==2 && current_state==0) FULLDOWN_to_OPERATIONAL();
        else if(previous_state==2 && current_state==1) FULLDOWN_to_PARTIALLYDOWN();

    }

    @Override
    public void OPERATIONAL_to_PARTIALLYDOWN() {
        //ASK FOR PROMT
        System.out.println("FOR REGULAR USER : ");
        System.out.println("Press 0 to enjoy service limitedly or press 1 to pay and enjoy from DEF server");
        Scanner sc = new Scanner(System.in) ;
        int service_type = 0 ;
        try
        {
            service_type = sc.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("Invalid input. Considering default option : 0");
        }

        if(service_type==0)System.out.println("You are now enjoying from with limited facilities");
        else if(service_type==1) {System.out.println("You are enjoying service completely from DEF. Your data is being copied in DEF server. You will be charged $20 per hour") ; payingUser=true;}


    }

    @Override
    public void OPERATIONAL_to_FULLDOWN() {
        //ASK FOR PROMT
        System.out.println("FOR REGULAR USER : ");
        System.out.println("Press 1 to pay and enjoy from DEF server");
        Scanner sc = new Scanner(System.in) ;
        int service_type = sc.nextInt();
        if(service_type==1)
        {
            System.out.println("You are enjoying service completely from DEF. Your data is being copied in DEF server.You will be charged $20 per hour") ;
            payingUser=true;
        }
        else
        {
            System.out.println("Invalid input . ");

        }
    }

    @Override
    public void PARTIALLYDOWN_to_OPERATIONAL() {
        //PAY UP
        System.out.println("FOR REGULAR USER : ");
        if(payingUser)
            System.out.println("Your total bill is : " + val);
    }

    @Override
    public void PARTIALLYDOWN_to_FULLDOWN() {
        System.out.println("FOR REGULAR USER : ");
        System.out.println("The system is completely down now ");
    }

    @Override
    public void FULLDOWN_to_OPERATIONAL() {
        //PAY UP
        System.out.println("FOR REGULAR USER : ");
        System.out.println("The system is now operational");
        if(payingUser)
            System.out.println("Your total bill is : " + val);
    }

    @Override
    public void FULLDOWN_to_PARTIALLYDOWN() {
//D0 NOTHING
        System.out.println("FOR REGULAR USER : ");
        System.out.println("The system is partially running now ");
        // Can do input to ensure if paying or not , but not mentioned in ques
    }
}
