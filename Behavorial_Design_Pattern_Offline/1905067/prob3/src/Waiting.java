public class Waiting implements  State{
    Vending_Machine Context ;
    public Waiting(Vending_Machine context)
    {
        this.Context = context ;
    }

    @Override
    public void InsertMoney() {
        System.out.println("Vending Machine is currently waiting");
        System.out.println("Received your money");
        Context.setCurrent_state(Context.getProcessing());
    }

    @Override
    public void TakeAction() {
        System.out.println("Sorry please try again later");

    }

    @Override
    public void OutputMessage() {
        System.out.println("No output here");
    }
}
