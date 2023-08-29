package problem_2;

public class Black_Coffee extends Coffee{
    @Override
    public String getDesciption_of_the_ingredients() {
        return "Black coffee prepared by adding ";
    }

    @Override
    public double cost() {
        int coffee_mug = 100 ;
        int beans = 30 ;
        int price = coffee_mug + beans ;
        return price ;
    }
}
