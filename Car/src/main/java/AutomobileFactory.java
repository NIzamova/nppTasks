/**
 * Created by N on 23.04.14.
 */
public class AutomobileFactory {
    public static Car CreateAutomobile(String carType){
        if(carType.equals("Automobile1"))
            return new Automobile1("black",(int)(Math.random()*5));
        return null;
    }
}
