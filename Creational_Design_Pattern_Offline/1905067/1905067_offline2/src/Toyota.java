import DriveTrain.FourWheel;
import DriveTrain.RearWheel;
import Engine.Electric;
import Engine.Hydro;

public class Toyota extends Car {

    public  Toyota()
    {
        Company = "Toyota" ;
        Hydro hydro= new Hydro() ;
        Engine = hydro.getEngineType() ;


        RearWheel rearWheel = new RearWheel() ;
        Drive_train = rearWheel.getWheelType() ;


        Color = "Red" ;
        Country = "Japan" ;
    }
}
