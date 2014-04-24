/**
 * Created by N on 23.04.14.
 */
abstract public class Automobile extends Car{


    public String ride(String TypeOfCar){
        return "Automobile rides";
    }

    public String toString(){
        return super.toString()+ride();
    }

}
