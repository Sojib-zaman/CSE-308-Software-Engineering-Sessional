public class Delivered implements State{
    Vending_Machine Context ;
    public Delivered(Vending_Machine context)
    {
        this.Context = context ;
    }
    @Override
    public void InsertMoney() {
        System.out.println("An error occured");
    }

    @Override
    public void TakeAction() {
        System.out.println("An error occured");
    }

    @Override
    public void OutputMessage() {
        System.out.println("Your package is now delivered. Thank you");
        Context.setProduct_Count(Context.getProduct_Count()-1);

    }
}
