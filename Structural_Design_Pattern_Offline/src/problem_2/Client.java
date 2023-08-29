package problem_2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Client {
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static void main(String[] args) {

//        System.out.println("Choose additional ingredients");
//        System.out.println("Press any other key to quit");
//        System.out.println("1. grinded coffee beans");
//        System.out.println("2. Milk ");
//        System.out.println("3. Dairy Cream ");
//        System.out.println("4. Cinnamon Powder ");
//        System.out.println("5. Chocolate sauce");

        boolean stop = false ;
        int total = 0 ;
        while (!stop)
        {

            System.out.println(ANSI_YELLOW+"Please choose a coffee type"+ANSI_RESET);
            System.out.println(ANSI_RED + "Press any other key to quit" + ANSI_RESET);
            System.out.println("1. Americano ");
            System.out.println("2. Espresso ");
            System.out.println("3. Cappuccino ");
            System.out.println("4. Mocha ");
            int type = 1 ;

            Scanner sc = new Scanner(System.in);
            try
            {
                type= sc.nextInt();
            }
            catch (Exception e)
            {
                System.out.println("You are now exiting the server");
                stop=true ;
               // exit(0);
            }
            if(stop) break;
            if(type==1)
            {
                System.out.println("Americano coffee");
                Coffee coffee = new Black_Coffee() ;
                coffee = new Grinded_Coffee_Beans(coffee) ;
                //coffee = new Grinded_Coffee_Beans(coffee) ;
                System.out.println("Ingredients : "+coffee.getDesciption_of_the_ingredients());
                System.out.println("Price of Americano : "+coffee.cost());
                total+=coffee.cost();
            }
            else if(type==2)
            {
                System.out.println("Espresso coffee");
                Coffee coffee = new Black_Coffee() ;
                coffee = new dairy_cream(coffee) ;
                System.out.println("Ingredients : "+coffee.getDesciption_of_the_ingredients());
                System.out.println("Price of Espresso : "+coffee.cost());
                total+=coffee.cost();
            }
            else if(type==3)
            {
                System.out.println("Cappucino coffee");
                Coffee coffee = new Milk_Coffee() ;
                coffee = new Cinnamon_Powder(coffee) ;
                System.out.println("Ingredients : "+coffee.getDesciption_of_the_ingredients());
                System.out.println("Price of Cappuccino : "+coffee.cost());
                total+=coffee.cost();
            }
            else if(type==4)
            {
                System.out.println("Mocha coffee");
                Coffee coffee = new Milk_Coffee() ;
                coffee = new Chocolate_Sauce(coffee) ;
                System.out.println("Ingredients : "+coffee.getDesciption_of_the_ingredients());
                System.out.println("Price of Mocha : "+coffee.cost());
                total+=coffee.cost();

            }


        }
        System.out.println(ANSI_CYAN+"The total cost of your order is : " + total+ANSI_RESET);
    }
}
