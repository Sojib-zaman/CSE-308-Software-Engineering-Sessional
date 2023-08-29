public interface DigitalWallet {
    public void setID(int ID) ;
    public int getID() ;
    public int getBalance();
    public void setBalance(int balance);
    public void send_money(int money , DigitalWallet acc) ;
    public void receive_money(int money) ;
    public void show() ;
    public String name() ;
}
