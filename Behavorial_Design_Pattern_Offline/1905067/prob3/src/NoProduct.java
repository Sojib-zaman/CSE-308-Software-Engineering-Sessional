public class NoProduct implements State{
    public NoProduct(Vending_Machine context)
    {
        this.Context = context ;
    }
    Vending_Machine Context ;
    @Override
    public void InsertMoney() {
        System.out.println("There is currently no product");
    }

    @Override
    public void TakeAction() {
        System.out.println("There is currently no product");
    }

    @Override
    public void OutputMessage() {
        System.out.println("There is currently no product");
    }
}
