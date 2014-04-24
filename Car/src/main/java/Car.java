/**
 * Created by N on 22.04.14.
 */
public abstract class Car implements Rideable  {
    private String Color;
    private int ID;
    public String toString(){
        return "I'm car. My color "+Color+ ". My id " +ID +  ". ";
    }


    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public int getId() {
        return ID;
    }

    public void setId(int id) {
        this.ID = id;
    }
}

