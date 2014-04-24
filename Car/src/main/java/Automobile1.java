/**
 * Created by N on 23.04.14.
 */
public class Automobile1 extends Automobile {
    //Automobile1 car;

    public Automobile1(String color, int id){
        super.setColor(color);
        super.setId(id);

    }

    public String ride(){
        return "Automobile 1 rides.";
    }

    public String toString(){
        return super.toString();
    }
}
