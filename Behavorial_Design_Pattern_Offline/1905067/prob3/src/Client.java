import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        System.out.println("VENDING MACHINE STARTS");

        Vending_Machine machine = new Vending_Machine();
        System.out.println("Each item costs 200 taka. ");
        System.out.println("Enter 0 to exit the process");
        System.out.println("");
        int Money=0;
        int quit=0;

        while (quit!=1)
        {
            

            System.out.println("Currently we have : "+machine.getProduct_Count()+" items available");
            if(machine.isEmpty()) //also means noproduct state
            {
                System.out.println("As the vending machine is currently empty. No incoming request is being accepted. ");
                System.out.println("Do you want to refill and set it waiting?");
                System.out.println("y - yes. It will refill 3 items");
                System.out.println("n - not now");
                Scanner sc = new Scanner(System.in) ;
                String c = sc.next();
                if(c.equalsIgnoreCase("y"))
                {
                    machine.setProduct_Count(3);
                    machine.setCurrent_state(machine.getWaiting());
                }
                else
                {
                    quit=1;break;
                }
            }
            //System.out.println(machine.getCurrent_state());
            while (Money<200)
            {
                System.out.println("Please Insert Atleast "+(200-Money)+" Taka to complete your transaction");
                try {
                    Scanner scanner = new Scanner(System.in) ;
                    Money += scanner.nextInt();
                }
                catch (Exception e)
                {
                    quit=1;
                    break;
                }

            }

            if(quit==1)break;


            machine.setUserMoney(Money);
            machine.setCurrent_state(machine.getWaiting());
            machine.complete_Process();

            System.out.println("");
            Money=0;
        }
        System.out.println("Thanks for using our service.");


    }
}
