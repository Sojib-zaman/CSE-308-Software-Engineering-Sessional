package problem_2;

public class Chocolate_Sauce  extends Decorator{
    Coffee coffee ;
    public Chocolate_Sauce(Coffee coffee)
    {
        this.coffee = coffee ;
    }
    @Override
    public String getDesciption_of_the_ingredients() {
        return coffee.getDesciption_of_the_ingredients()+" Chocolate_Sauce " ;

    }
    public double cost()
    {
        return coffee.cost()+60;
    }

}
