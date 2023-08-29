package problem_1;

import static problem_1.Simulation.ANSI_RED;
import static problem_1.Simulation.ANSI_RESET;

public class Imposter implements IntImposter{
    @Override
    public void fake_electrical() {
        System.out.println(ANSI_RED+"IMPOSTER : I am faking electrical tasks now . Don't tell anyone . Shhhh"+ANSI_RESET);
    }

    @Override
    public void fake_admincard() {
        System.out.println(ANSI_RED+"IMPOSTER : I am faking admin card swipe now ."+ANSI_RESET);
    }

    @Override
    public void fake_trash() {
        System.out.println(ANSI_RED+"IMPOSTER : I am faking trash cleaning now . "+ANSI_RESET);
    }

    @Override
    public void fake_scan() {
        System.out.println(ANSI_RED+"IMPOSTER : I am faking medical scan now . Hope no one else comes to try it ."+ANSI_RESET);
    }

    @Override
    public void sabotage_reactor() {
        System.out.println(ANSI_RED+"IMPOSTER : let's call the reactor off . "+ANSI_RESET);
    }

    @Override
    public void sabotage_electrical() {
        System.out.println(ANSI_RED+"IMPOSTER : let's call the lights out . Only I can see now with my imposter vision. "+ANSI_RESET);
    }

    @Override
    public void closedoor() {
        System.out.println(ANSI_RED+"IMPOSTER : I am closing the door and trapping others"+ANSI_RESET);
    }

    @Override
    public void kill() {
        System.out.println(ANSI_RED+"IMPOSTER : sorry crewmate , time to die. "+ANSI_RESET);
    }

    @Override
    public void vent() {
        System.out.println(ANSI_RED+"IMPOSTER : let's see what's inside those vents. "+ANSI_RESET);
    }
}
