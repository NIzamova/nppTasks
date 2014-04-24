/**
 * Created by N on 23.04.14.
 */
abstract public class TruckCar extends Car {

    public String ride(){
        return "Truckcar rides";
    }

        public String toString(){
            return super.toString() + ride();
        }


}
