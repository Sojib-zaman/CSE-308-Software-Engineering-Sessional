package Observer;

import java.util.Observable;
import java.util.Observer;

public class CurrentCondition implements Subcr_Observer, display , SevereWeatherUpdate{
    float temp;
    String condition;
    Subject weatherdata ;

    String alert ;
    public CurrentCondition(Subject weatherdata) {
        this.weatherdata = weatherdata ;
        weatherdata.register(this);

    }

    @Override
    public void displaydata() {
        System.out.println("Current conditions : "+temp+" degree Celsius. The weather condition is  "+condition+". ");
        String update = forcast();
        System.out.println(update);
        System.out.println(" ");
    }

    @Override
    public void update(float temp, String condition , String alert) {
            this.temp = temp ;
            this.alert = alert ;
            this.condition = condition;
            displaydata();
    }

    @Override
    public String forcast() {
/*        if(temp<=20 && condition.equalsIgnoreCase("Rainy"))
            return "There is a Possibility of Storm.";
        else if(temp<=10 && condition.equalsIgnoreCase("Snowy"))
            return  "There is a Possibility of heavy Snow.";
        return "There is currently no alert for severe condition.";*/
        return alert;
    }
}
