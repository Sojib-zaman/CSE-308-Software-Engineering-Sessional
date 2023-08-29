import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        CarManufacturerCompany factory = new CarManufacturerCompany();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your region for car info");
        String location = sc.next();
        Car car = null;
        car = factory.getCar(location) ;
        car.print();
    }
}
