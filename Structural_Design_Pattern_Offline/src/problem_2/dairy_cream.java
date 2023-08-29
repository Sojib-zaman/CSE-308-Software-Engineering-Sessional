package problem_2;

public class dairy_cream extends Decorator{
    Coffee coffee ;
    public dairy_cream(Coffee coffee)
    {
        this.coffee = coffee ;
    }
    @Override
    public String getDesciption_of_the_ingredients() {
        return coffee.getDesciption_of_the_ingredients()+" dairy_cream" ;

    }
    public double cost()
    {
        return coffee.cost()+40;
    }

}
