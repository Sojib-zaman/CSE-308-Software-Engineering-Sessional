import java.util.LinkedList;
import java.util.Scanner;



public class Client {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        String Order="" ;
        LinkedList<PC_Product>Final_Product = new LinkedList<PC_Product>() ;
        Director director = new Director() ;
        while(true)
        {
            System.out.println("Press O to open a new order");

            System.out.println("Press E to exit without any order");
            Order = scanner.next() ;
            //System.out.println("");

            int start = 0 , exit = 0 ;
            if(Order.equalsIgnoreCase("E"))
            {
               // System.exit(0);
                break;
            }
            else if(Order.equalsIgnoreCase("O"))
            {

                while (start==0)
                {
                    int confirm = 1 ;


                    System.out.println("Choose a PC type");
                    System.out.println("1. AMD Ryzen 7 5700X Gaming PC");
                    System.out.println("2. 11th generation intel processor Core i5");
                    System.out.println("3. 11th generation intel processor Core i7");
                    System.out.println("4. 11th generation intel processor Core i9");
                    System.out.println("-------------------------------");
                    PC_Builder iBuilder = null;

                    Order = scanner.next() ;

                    if(Order.equalsIgnoreCase("E"))
                    {
                        confirm = 0 ;
                        System.out.println("Order can't be closed without a PC");
                    };
                    if(Order.equalsIgnoreCase("1"))  iBuilder = new GamingPC() ;
                    else if(Order.equalsIgnoreCase("2"))  iBuilder = new TypeOne() ;
                    else if(Order.equalsIgnoreCase("3"))  iBuilder = new TypeTwo() ;
                    else if(Order.equalsIgnoreCase("4"))  iBuilder = new TypeThree() ;
                    else if(Order.equalsIgnoreCase("o"))
                    {
                        confirm = 0 ;
                        System.out.println("Sorry , you can't open another order now");

                    }

                    if(confirm==1)
                    {
                        start=1 ;
                        LinkedList<String>RamChoice = new LinkedList<String>() ;
                        LinkedList<String>GraphicsCardChoice = new LinkedList<String>() ;

                        while (exit==0)
                        {

                            System.out.println("Customize Your PC . Press R for Ram and G for Graphics Card. Press E to exit and see the whole PC build Process");
                            //System.out.println("");
                            Order = scanner.next();
                            if (Order.equalsIgnoreCase("R")) {
                                System.out.println("Select Ram type : ");
                                System.out.println("1. 8 GB DDR4 RAM - 2666 MHz");
                                System.out.println("2. 8 GB DDR4 RAM - 3200 MHz");
                                Order = scanner.next();
                                if (Order.equalsIgnoreCase("1")) RamChoice.add("8 GB DDR4 RAM - 2666 MHz");
                                else if (Order.equalsIgnoreCase("2")) RamChoice.add("8 GB DDR4 RAM - 3200 MHz");
                                else {
                                    System.out.println("Please select a valid input");
                                    System.out.println("");
                                }



                            } else if (Order.equalsIgnoreCase("G")) {
                                System.out.println("Select Graphics Card type : ");
                                System.out.println("1. 2GB ");
                                System.out.println("2. 4GB");
                                Order = scanner.next();
                                if (Order.equalsIgnoreCase("1")) GraphicsCardChoice.add("2GB");
                                else if (Order.equalsIgnoreCase("2")) GraphicsCardChoice.add("4GB");
                                else System.out.println("Please select a valid input");
                            }
                            else if(Order.equalsIgnoreCase("E"))
                                exit=1 ;
                            else {
                                System.out.println("Please select a valid input");
                                System.out.println("");
                            }
                        }
                        director.setRam(RamChoice);
                        director.setGC(GraphicsCardChoice);
                        director.Construct(iBuilder);
                        PC_Product p1 = iBuilder.getfinalproduct();
                        Final_Product.add(p1) ;



                    }

                }
            }
            else
            {
                System.out.println("Please choose to order or exit the console");
                System.out.println(" ");
            }



        }
        System.out.println("Your Ordered PC : ");
        for(int i=0 ; i<Final_Product.size() ; i++)
        {
            Final_Product.get(i).printElements();
            System.out.println("-----------------------------");
        }








    }



}
