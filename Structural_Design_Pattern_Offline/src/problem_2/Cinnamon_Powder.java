package problem_2;

public class Cinnamon_Powder extends Decorator{
    Coffee coffee ;
    public Cinnamon_Powder(Coffee coffee)
    {
        this.coffee = coffee ;
    }
    @Override
    public String getDesciption_of_the_ingredients() {
        return coffee.getDesciption_of_the_ingredients()+" Cinnamon_Powder" ;

    }
    public double cost()
    {
        return coffee.cost()+50;
    }

}
