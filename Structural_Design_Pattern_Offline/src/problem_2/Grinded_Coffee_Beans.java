package problem_2;

public class Grinded_Coffee_Beans extends Decorator{
    Coffee coffee ;
    public Grinded_Coffee_Beans(Coffee coffee)
    {
        this.coffee = coffee ;
    }
    @Override
    public String getDesciption_of_the_ingredients() {
        return coffee.getDesciption_of_the_ingredients()+" Grinded_Coffee_Beans" ;

    }
    public double cost()
    {
        return coffee.cost()+30;
    }

}
