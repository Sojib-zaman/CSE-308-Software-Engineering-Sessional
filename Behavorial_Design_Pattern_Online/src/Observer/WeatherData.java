package Observer;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class WeatherData implements Subject,ManipulateData{
    private ArrayList observers;
    float temp;
    String alert = "No alert";
    String condition="sunny";

    public String getAlert() {
        return alert;
    }

    public void setAlert(String alert) {
        this.alert = alert;
    }

    public WeatherData()
    {
        observers=new ArrayList() ;
    }
    public float getTemp() {
        return temp;
    }

    public void setTemp(float temp) {
        this.temp = temp;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public void setMeasurements(float temp , String condition , String alert)
    {
        setTemp(temp);
        setCondition(condition);
        setAlert(alert);
        measurementschanged();
    }

    @Override
    public void register(Subcr_Observer s) {
        observers.add(s) ;
    }

    @Override
    public void remove(Subcr_Observer s) {
        int i= observers.indexOf(s) ;
        if(i>=0) observers.remove(s) ;
    }

    @Override
    public void notifyobs() {
        for(int i=0  ;i<observers.size() ; i++)
        {
            Subcr_Observer observer = (Subcr_Observer) observers.get(i) ;
            observer.update(temp , condition , alert) ;
        }

    }
    public void measurementschanged()
    {
        notifyobs();
    }
}
