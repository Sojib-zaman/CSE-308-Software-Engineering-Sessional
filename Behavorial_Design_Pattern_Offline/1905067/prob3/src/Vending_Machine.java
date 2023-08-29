public class Vending_Machine {
    State Waiting ;
    State NoProduct ;
    State Delivered;
    State Processing;

    int Product_Count = 3 ;

    public State getProcessing() {
        return Processing;
    }

    public void setProcessing(State processing) {
        Processing = processing;
    }

    int userMoney = 2 ;
    State current_state ;
    int price = 200;
    public Vending_Machine()
    {
        Waiting = new Waiting(this);
        NoProduct = new NoProduct(this );
        Delivered  = new Delivered(this ) ;
        Processing  = new Processing(this ) ;
        if(Product_Count==0)
            current_state=NoProduct;
        else current_state=Waiting ;
    }

    public State getWaiting() {
        return Waiting;
    }

    public void setUserMoney(int userMoney) {
        this.userMoney = userMoney;
    }
    public int getUserMoney(){return userMoney;}
    public void setWaiting(State waiting) {
        Waiting = waiting;
    }

    public State getNoProduct() {
        return NoProduct;
    }

    public void setNoProduct(State noProduct) {
        NoProduct = noProduct;
    }

    public State getDelivered() {
        return Delivered;
    }

    public void setDelivered(State delivered) {
        Delivered = delivered;
    }

    public int getProduct_Count() {
        return Product_Count;
    }

    public void setProduct_Count(int product_Count) {
        Product_Count = product_Count;
    }

    public State getCurrent_state() {
        return current_state;
    }

    public void setCurrent_state(State current_state) {
        this.current_state = current_state;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }
    public void complete_Process()
    {
        current_state.InsertMoney();
        current_state.TakeAction();
        current_state.OutputMessage();
    }
    public boolean isEmpty()
    {
        if(Product_Count==0)return true;
        else return  false  ;
    }
}
