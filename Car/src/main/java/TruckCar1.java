/**
 * Created by N on 23.04.14.
 */
public class TruckCar1 extends TruckCar {
    //TruckCar1 car;

    public TruckCar1(String color, int id){
        super.setColor(color);
        super.setId(id);

    }

    public String ride(){
        return "TruckCar1 rides.";
    }

    public String toString(){
        return super.toString();
    }
}
