public class CarManufacturerCompany {
    public Car getCar(String CarType)
    {

        if(CarType==null) return null ;
        if(CarType.equalsIgnoreCase("United States"))
        {
            return new Tesla() ;
        }
        else if(CarType.equalsIgnoreCase("Europe"))
        {
            return new BMW() ;
        }
        else if(CarType.equalsIgnoreCase("Asia"))
        {
            return new Toyota() ;
        }
        return  null ;
    }
}
