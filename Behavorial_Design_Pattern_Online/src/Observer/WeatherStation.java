package Observer;

import java.util.Scanner;

import static java.lang.System.exit;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        int option =0 ;
        float temp=0 ;
        String condition="Sunny";
        String alert=" ";
        while (true)
        {
            Scanner scanner = new Scanner(System.in) ;
            System.out.println("Enter your option : ");
            System.out.println("0 : input temp");
            System.out.println("1 : input condition");
            System.out.println("2 : input alert");
            System.out.println("3 : Send info");
            System.out.println("Quit with any button");
            try
            {
                option  = scanner.nextInt();
            }
            catch (Exception e)
            {
                exit(0);

            }

            if(option>3)
            {
                System.out.println("INVALID INPUT");
                try {
                    exit(0);
                }
                catch (Exception e)
                {

                }

            }
            if(option==0) {
                System.out.println("Enter temperature");
                temp = scanner.nextFloat();
            }
            else if(option==1)
            {
                System.out.println("Enter condition");
                condition=scanner.next();
            }
            else if(option==2) {
                System.out.println("Enter alert if necessary");
                alert = scanner.next();
            }
            else
                weatherData.setMeasurements(temp,condition,alert);


        }

        /*
        weatherData.setMeasurements(30,"Sunny","") ;
        weatherData.setMeasurements(20,"Rainy","There is a Possibility of Storm.");
        weatherData.setMeasurements(04,"Snowy","There is a Possibility of heavy Snow.");
        */


    }
}
