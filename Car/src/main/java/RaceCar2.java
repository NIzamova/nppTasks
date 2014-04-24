/**
 * Created by N on 23.04.14.
 */
public class RaceCar2 extends Racecar {
   // RaceCar2 car;

    public RaceCar2(String color, int id, int speed){
        super.setColor(color);
        super.setId(id);
        super.setSpeed(speed);

    }

    public String ride(){
        return " RaceCar2 rides. ";
    }
    public String toString(){
        return super.toString();
    }

}
