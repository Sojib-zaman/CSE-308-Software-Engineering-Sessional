package UsingObs;

import UsingObs.ABC_Server;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class PremiumUser implements Observer , User {
    Observable observable;
    boolean two_server = false;
    public PremiumUser(Observable observable)
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
        // ASK USER IF HE WANTS ONE SERVER OR TWO SERVER
        System.out.println("PREMIUM USER : ");
        System.out.println("The ABC server is partially down");
        System.out.println("Press 0 for partial service from ABC and DEF . Press 1 for complete shift to DEF");
        Scanner sc = new Scanner(System.in) ;
        int service_type = sc.nextInt();
        if(service_type==0){ System.out.println("You are now enjoying from both ABC and DEF"); two_server=true;}
        else if(service_type==1) System.out.println("You are enjoying service completely from DEF");
    }

    @Override
    public void OPERATIONAL_to_FULLDOWN() {
        System.out.println("PREMIUM USER : ");
        System.out.println("As our ABC server is completely down. You are currently enjoying service from DEF server");
    }

    @Override
    public void PARTIALLYDOWN_to_OPERATIONAL() {
        System.out.println("PREMIUM USER : ");
        System.out.println("You are currently enjoying service from ABC server completely");
    }

    @Override
    public void PARTIALLYDOWN_to_FULLDOWN() {
        System.out.println("PREMIUM USER : ");
        System.out.println("You are currently enjoying service from DEF server completely");

    }

    @Override
    public void FULLDOWN_to_OPERATIONAL() {
        System.out.println("PREMIUM USER : ");

        System.out.println("You are currently enjoying service from ABC server completely");
    }

    @Override
    public void FULLDOWN_to_PARTIALLYDOWN() {
        System.out.println("PREMIUM USER : ");
        System.out.println("Server is now partially running");
       /* System.out.println("Press 0 for partial service from ABC and DEF . Press 1 for complete shift to DEF");
        Scanner sc = new Scanner(System.in) ;
        int service_type = sc.nextInt();
        if(service_type==0){ System.out.println("You are now enjoying from both ABC and DEF"); two_server=true;}
        else if(service_type==1) System.out.println("You are enjoying service completely from DEF");*/
    }
}
