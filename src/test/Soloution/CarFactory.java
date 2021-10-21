package test.Soloution;

import com.company.Car;
import com.company.LuxoryCar;
import com.company.SportsCar;

public class CarFactory
{
    public static Car getCar(String type)
    {

        Car car = null;
        if(type.equals("Standard"))
        {
            car = new Car();
        }
        if(type.equals("Luxory"))
        {
            car = new LuxoryCar();
        }
        if(type.equals("Sports"))
        {
            car = new SportsCar();
        }
        car.assemble();
        car.roadTest();
        car.deliver();
        return car;
    }
}

