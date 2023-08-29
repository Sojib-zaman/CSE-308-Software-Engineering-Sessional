package WithoutOBS;


import java.util.ArrayList;

public class ABC_Server implements Subject{


    private ArrayList users ;

    private int operational = 0;
    private int partially_down = 1 ;
    private int complete_down = 2;

    private int prev_state = 0 ; //by default starting operational
    private int current_state = 0 ;


    public ABC_Server()
    {
        System.out.println("Welcome to ABC server homepage");
        users = new ArrayList();
    }

    public int getPrev_state() {
        return prev_state;
    }

    public void setPrev_state(int prev_state) {
        this.prev_state = prev_state;
    }

    public int getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(int current_state) {
        this.current_state = current_state;
    }

    void setChangeState(int old_state , int new_state)
    {
        if(old_state==new_state) System.out.println("The state is unchanged now");
        else
        {
            setPrev_state(old_state);
            setCurrent_state(new_state);

            state_changed();
        }

    }

    private void state_changed() {
        notifyobs();
    }

    @Override
    public void register(User s) {
        users.add(s);
    }

    @Override
    public void remove(User s) {
        int i = users.indexOf(s) ;
        if(i>=0)users.remove(s) ;
    }

    @Override
    public void notifyobs() {

        for(int i = 0 ; i< users.size() ; i++)
        {
            User user = (User) users.get(i) ;
            user.update(prev_state , current_state);
        }
    }
}
