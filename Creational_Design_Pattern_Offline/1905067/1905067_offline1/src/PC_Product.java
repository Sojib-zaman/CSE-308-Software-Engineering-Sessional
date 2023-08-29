import ItemList.PC_components;

import java.util.LinkedList;

public class PC_Product {
    private int ac = 0 ;
    private LinkedList<PC_components>Complete_PC ;
    private LinkedList<Integer>PriceItems ;
    public PC_Product()
    {
        Complete_PC = new LinkedList<PC_components>() ;
        PriceItems = new LinkedList<Integer>() ;
    }
    public void addComponent(PC_components newElement)
    {
        Complete_PC.add(newElement) ;
        PriceItems.add(newElement.getprice()) ;
    }
    public void printElements()
    {
        System.out.println("Name of the PC : " + Complete_PC.get(0).getname());
        System.out.println("Base Components :");
        System.out.println("");
        for(int i=1 ; i<4; i++)
        {

            System.out.println(Complete_PC.get(i).getname());

        }

        System.out.println("Added Components : ");
        System.out.println("");
        for(int i=4 ; i<Complete_PC.size() ; i++)
        {
            System.out.println(Complete_PC.get(i).getname());

        }
        System.out.println("");

        System.out.println("Base Price for the PC : " + PriceItems.get(0));

        int total_price = 0 ;
        for(int i=0 ; i<PriceItems.size() ; i++)
            total_price+=PriceItems.get(i) ;
        System.out.println("Total Price after addition : "+ total_price);
        System.out.println("");

        if(total_price!=PriceItems.get(0)) //so new element are added with price
        {
            for(int i=0 ; i<Complete_PC.size() ; i++)
            {
                if(Complete_PC.get(i).getprice()!=0)
                {
                    System.out.println(Complete_PC.get(i).getname() + " which costs " + Complete_PC.get(i).getprice());
                }
            }
        }
    }
    public void printPrice()
    {
        for(int i=0 ; i<PriceItems.size() ; i++)
            System.out.println(PriceItems.get(i));
    }
    public void addPrice(int x)
    {
        PriceItems.add(x) ;
    }
}
