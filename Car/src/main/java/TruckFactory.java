/**
 * Created by N on 23.04.14.
 */
public class TruckFactory {
   // private Car car;

    public static Car CreateTruck(String CarType) {
        if (CarType.equals("TruckCar1")) {
            return new TruckCar1("black",(int)(Math.random()*5));
        }

        return null;
    }

}
