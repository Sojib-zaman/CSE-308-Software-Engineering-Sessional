public class Akash implements DigitalWallet {
    int NID ;
    int balance ;
    int min = 1000 ;

    public Akash(int NID) {
        this.NID = NID;
        this.balance = min;
    }

    public int getID() {
        return NID;
    }

    public void setID(int ID) {
        this.NID = ID;
    }

    public int getBalance() {
        return balance;
    }
    public String name(){return "Akash " ; }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void send_money(int money , DigitalWallet acc)
    {
        if(balance<money) {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(name()+" " +getID()+ " Sending "+money+" Taka to "+acc.name()+" "+acc.getID());
            balance-=money  ;
            show();
            acc.receive_money(acctype(acc, money));
        }

    }
    public void receive_money(int money)
    {
        balance+=money ;show();
    }

    public void show()
    {
        System.out.println("NID : "+NID+" . Current balance : "+balance);
    }
    public int acctype(DigitalWallet acc , int money)
    {
        if(acc instanceof Akash) return  money ;
        else if(acc instanceof Payfren) return  money/100 ;
        else return money*2 ;
    }
}
