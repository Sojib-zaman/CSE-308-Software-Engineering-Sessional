public class Payfren implements DigitalWallet{
    int SSN ;
    int balance ;
    int min = 10 ;

    public Payfren(int SSN) {
        this.SSN = SSN;
        this.balance = min;
    }

    @Override
    public void setID(int ID) {
        this.SSN = ID ;

    }

    @Override
    public int getID() {
        return SSN;
    }

    @Override
    public int getBalance() {
        return balance;
    }

    @Override
    public void setBalance(int balance) {
        this.balance = balance ;
    }
    public String name(){return "Payfren " ; }
    public void send_money(int money , DigitalWallet acc)
    {
        if(balance<money) {
            System.out.println("Insufficient balance");
        }
        else
        {
            System.out.println(name()+" " +getID()+ " Sending "+money+" Dollar to "+acc.name()+" "+acc.getID());
        balance-=money  ;show();
        acc.receive_money(acctype(acc, money));}
    }
    public void receive_money(int money)
    {
        balance+=money ;show();
    }
    public void show()
    {
        System.out.println("SSN : "+SSN+" . Current balance : "+balance);
    }
    public int acctype(DigitalWallet acc , int money)
    {
        if(acc instanceof Payfren) return  money ;
        else if(acc instanceof Akash) return  money*100 ;
        else return money/50 ;
    }
}

