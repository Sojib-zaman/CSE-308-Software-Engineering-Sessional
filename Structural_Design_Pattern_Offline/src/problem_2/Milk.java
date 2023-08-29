package problem_2;

public class Milk extends Decorator{
    Coffee coffee ;
    public Milk(Coffee coffee)
    {
        this.coffee = coffee ;
    }
    @Override
    public String getDesciption_of_the_ingredients() {
        return coffee.getDesciption_of_the_ingredients()+" Milk" ;

    }
   public double cost()
   {
       return coffee.cost()+50;
   }

}
