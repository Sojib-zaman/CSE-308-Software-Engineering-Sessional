import DriveTrain.FourWheel;
import DriveTrain.RearWheel;
import Engine.Electric;

public class Tesla extends Car{
    public  Tesla()
    {
        Company = "Tesla" ;
        Electric electric = new Electric() ;
        Engine = electric.getEngineType() ;


        FourWheel fourWheel = new FourWheel() ;
        Drive_train = fourWheel.getWheelType() ;

        Color = "White" ;
        Country = "US" ;
    }
}
