import DriveTrain.RearWheel;
import Engine.Electric;

public class BMW extends Car{
    public  BMW()
    {
        Company = "BMW" ;
        Electric electric = new Electric() ;
        Engine = electric.getEngineType() ;


        RearWheel rearWheel = new RearWheel() ;
        Drive_train = rearWheel.getWheelType() ;

        Color = "Black" ;
        Country = "Germany" ;
    }

}
