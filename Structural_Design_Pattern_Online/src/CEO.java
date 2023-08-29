public class CEO {
    public static void main(String[] args) {
        Akash[] akash_user;
        akash_user = new Akash[2] ;
        Payfren[] payfrens;
        payfrens = new Payfren[2] ;
        Dharai[] dharais;
        dharais = new Dharai[2] ;
        for(int i=0 ; i<2 ; i++)
        {
            akash_user[i] = new Akash(i) ;
            payfrens[i] = new Payfren(i) ;
            dharais[i] = new Dharai(i) ;
        }

        akash_user[0].send_money(500 , akash_user[1]);
        payfrens[0].send_money(5 , payfrens[1]);
        dharais[0].send_money(1000 , dharais[1]);

        Adaptor cross_connection = new Adaptor();
        cross_connection.send_money(10 , payfrens[0] , akash_user[0]);
        cross_connection.send_money(2 , payfrens[0] , akash_user[0]);
        cross_connection.send_money(500 , akash_user[1] , dharais[1]);
    }
}
