public class Processing implements State{
    Vending_Machine Context ;
    public Processing(Vending_Machine context)
    {
        this.Context = context ;
    }

    @Override
    public void InsertMoney() {
        System.out.println("An error occured");
    }

    @Override
    public void TakeAction() {
        System.out.println("Your Request is being processed right now");
        if(Context.getUserMoney()>Context.getprice())
        {
            int extra_money = Context.getUserMoney() - Context.getprice();
            System.out.println("You paid "+ extra_money + " taka extra. Here is your change and your item will be delivered soon.");
            Context.setCurrent_state(Context.getDelivered());
        }
        else Context.setCurrent_state(Context.getDelivered());
    }

    @Override
    public void OutputMessage() {
        System.out.println("An error occured");
    }
}
