public class Dharai implements DigitalWallet{
    int Kojin_bango ;
    int balance ;
    int min = 1500 ;

    public Dharai(int kojin_bango) {
        Kojin_bango = kojin_bango;
        this.balance = min;
    }

    @Override
    public void setID(int ID) {
        this.Kojin_bango = ID ;

    }

    @Override
    public int getID() {
        return Kojin_bango;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance ;
    }
    public String name(){return "Dharai " ; }
    public void send_money(int money , DigitalWallet acc)
    {
        if(balance<money) {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(name()+" " +getID()+ " Sending "+money+" Kojlin to "+acc.name()+" "+acc.getID());
        balance-=money  ;show();
        acc.receive_money(acctype(acc, money));}
    }
    public void receive_money(int money)
    {
        balance+=money ;show();
    }
    public void show()
    {
        System.out.println("kojlin : "+Kojin_bango+" . Current balance : "+balance);
    }
    public int acctype(DigitalWallet acc , int money)
    {
        if(acc instanceof Dharai) return  money ;
        else if(acc instanceof Akash) return  money/2 ;
        else return money/50 ;
    }
}
