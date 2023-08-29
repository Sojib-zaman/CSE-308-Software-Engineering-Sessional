package problem_1;

import java.util.ArrayList;

public class Simulation {
    public static final String ANSI_RESET ="\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Crewmate[] crewmates;
        crewmates = new Crewmate[6] ;
        Crewmate singleCrew = new Crewmate();
        Imposter imposter = new Imposter();
        IntCrewmate fake_crewmate = new ImposterAdaptsToCrewmate(imposter);
        for (int i = 0; i < 5; i++)
        {
            crewmates[i] = new Crewmate();
        }
        System.out.println("The match begins ");

        singleCrew.medscan();
        singleCrew.admin_card();
        fake_crewmate.electrical();
        imposter.closedoor();
        imposter.sabotage_electrical();
        singleCrew.trash();
        fake_crewmate.admin_card();
        imposter.kill();
        imposter.vent();
        fake_crewmate.trash();
        singleCrew.medscan();
        imposter.sabotage_reactor();

    }
}
