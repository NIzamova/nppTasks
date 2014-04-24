import java.util.ArrayList;

/**
 * Created by N on 24.04.14.
 */
public class AutomobileSalon {

    private ArrayList<RaceCar1> RaceCar1list= new ArrayList<RaceCar1>();
    private ArrayList<RaceCar2> RaceCar2list = new ArrayList<RaceCar2>();
    private ArrayList<Automobile1> Automobilelist = new ArrayList<Automobile1>();
    private ArrayList<TruckCar1> TruckList = new ArrayList<TruckCar1>();

    public AutomobileSalon(){
        RaceCar1list.add((RaceCar1) RacecarFactory.CreateRacecar("RaceCar1"));
        RaceCar1list.add((RaceCar1) RacecarFactory.CreateRacecar("RaceCar1"));
        RaceCar1list.add((RaceCar1) RacecarFactory.CreateRacecar("RaceCar1"));
        RaceCar1list.add((RaceCar1) RacecarFactory.CreateRacecar("RaceCar1"));
        RaceCar2list.add((RaceCar2) RacecarFactory.CreateRacecar("RaceCar2"));
        RaceCar2list.add((RaceCar2) RacecarFactory.CreateRacecar("RaceCar2"));
        Automobilelist.add((Automobile1) AutomobileFactory.CreateAutomobile("Automobile1"));
        Automobilelist.add((Automobile1) AutomobileFactory.CreateAutomobile("Automobile1"));
        Automobilelist.add((Automobile1) AutomobileFactory.CreateAutomobile("Automobile1"));
        Automobilelist.add((Automobile1) AutomobileFactory.CreateAutomobile("Automobile1"));
        TruckList.add((TruckCar1) TruckFactory.CreateTruck("TruckCar1"));
        TruckList.add((TruckCar1) TruckFactory.CreateTruck("TruckCar1"));
        TruckList.add((TruckCar1) TruckFactory.CreateTruck("TruckCar1"));

    }
    public ArrayList<Car> FindCarById(int id){
        ArrayList<Car> result = new ArrayList<Car>();
        for(int i=0;i<RaceCar1list.size();i++){
            if(RaceCar1list.get(i).getId()==id) {
                result.add(RaceCar1list.get(i));
            }
        }
        for(int i=0;i<RaceCar2list.size();i++){
            if(RaceCar2list.get(i).getId()==id){
                result.add(RaceCar2list.get(i));
            }
        }
        for(int i=0;i<Automobilelist.size();i++){
            if(Automobilelist.get(i).getId()==id){
                result.add(Automobilelist.get(i));
            }
        }
        for(int i=0;i< TruckList.size();i++){
            if(TruckList.get(i).getId()==id){
                result.add(TruckList.get(i));
            }
        }
        return result;

    }
    public void PrintCar(ArrayList<Car> lists){
        for(int i=0;i< lists.size();i++){
            System.out.println(lists.get(i));

        }
    }

   /* public void print(){
        System.out.println("All cars: ");
        for(int i=0;i<RaceCar1list.size();i++){
            System.out.println(RaceCar1list.get(i));
        }
        for(int i=0;i<RaceCar2list.size();i++){
            System.out.println(RaceCar2list.get(i));
        }
        for(int i=0;i< TruckList.size();i++){
            System.out.println(TruckList.get(i));
        }
        for(int i=0;i<Automobilelist.size();i++){
            System.out.println(Automobilelist.get(i));
        }
    }*/

}

