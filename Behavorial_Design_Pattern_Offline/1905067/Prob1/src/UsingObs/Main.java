package UsingObs;

import UsingObs.ABC_Server;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        ABC_Server server = new ABC_Server();
        PremiumUser premiumUser = new PremiumUser(server);
        RegularUser regularUser = new RegularUser(server);
        int current_state = 0 ;
        boolean stop = false;
        int temp_state=0;
        int printer=0 ;
        System.out.println("Input 0 to Make Operational");
        System.out.println("Input 1 to Make Partially down");
        System.out.println("Input 2 to Make completely down");
        while (!stop)
        {
            if(printer!=0)info();

            Scanner sc = new Scanner(System.in);
            try
            {
                 temp_state= sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("You are now exiting the server");
                stop=true ;
                exit(0);

            }


            if(temp_state>=0 && temp_state<=2)
            {
                server.setChangeState(current_state,temp_state);
                current_state=temp_state;
            }
            printer=1;


        }


    }

    private static void info() {

        System.out.println("0 -> Operational");
        System.out.println("1 -> Partially down");
        System.out.println("2 -> completely down");
    }
}
