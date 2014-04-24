/**
 * Created by N on 23.04.14.
 */
public class RaceCar1 extends Racecar{


    public RaceCar1(String color, int id, int speed){
        super.setId(id);
        super.setColor(color);
        super.setSpeed(speed);

    }

    public String ride(){
        return " RaceCar1 rides. ";
        }

    public String toString(){
        return super.toString();
    }

    }


