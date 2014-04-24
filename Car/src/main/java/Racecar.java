/**
 * Created by N on 22.04.14.
 */
abstract  public class Racecar extends Car{

    private int Speed;

    public void setSpeed(int speed){
        Speed= speed;
    }



    public String ride(String TypeOfCar){
        return "Racecar rides. ";
    }

    public String toString(){
        return super.toString()+ ride()+ " My max speed "+ Speed;
    }


}
