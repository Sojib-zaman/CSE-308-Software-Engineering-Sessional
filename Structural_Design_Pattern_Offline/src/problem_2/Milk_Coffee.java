package problem_2;

public class Milk_Coffee extends Coffee{
    @Override
    public String getDesciption_of_the_ingredients() {
        return "Milk coffee prepared by adding ";
    }

    @Override
    public double cost() {
        int coffee_mug = 100 ;
        int milk = 50 ;
        int beans = 30 ;
        int price = coffee_mug + milk + beans ;
        return price ;
    }
}
