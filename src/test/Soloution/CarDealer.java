package test.Soloution;
import com.company.Car;
import  com.company.LuxoryCar;
import com.company.SportsCar;
public class CarDealer
{
    public static void main(String args[])
    {
        Car car = CarFactory.getCar("Luxory");
        Car car1 = CarFactory.getCar("Sports");
    }
}
