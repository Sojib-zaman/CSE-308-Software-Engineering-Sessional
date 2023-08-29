package problem_1;

import static problem_1.Simulation.ANSI_GREEN;
import static problem_1.Simulation.ANSI_RESET;

public class Crewmate implements IntCrewmate{
    @Override
    public void electrical() {
        System.out.println(ANSI_GREEN+"CREWMATE :  I am fixing electrical wires now"+ANSI_RESET);
    }

    @Override
    public void trash() {
        System.out.println(ANSI_GREEN+"CREWMATE :  I am taking the trash out now"+ANSI_RESET);
    }

    @Override
    public void admin_card() {
        System.out.println(ANSI_GREEN+"CREWMATE :  I am swiping the admin card now"+ANSI_RESET);
    }

    @Override
    public void medscan() {
        System.out.println(ANSI_GREEN+"CREWMATE :  scanning in the medbay now"+ANSI_RESET);
    }
}
