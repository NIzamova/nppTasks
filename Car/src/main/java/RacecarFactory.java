/**
 * Created by N on 23.04.14.
 */
public class RacecarFactory {
    public static Car CreateRacecar(String carType) {

    if(carType.equals("RaceCar1"))
        return new RaceCar1("black",(int)(Math.random()*5),250);
        if (carType.equals("RaceCar2"))
            return new RaceCar2("black",(int)(Math.random()*5),300);
        return null;
}

}
