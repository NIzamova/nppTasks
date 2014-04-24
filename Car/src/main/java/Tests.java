import java.util.Scanner;

/**
 * Created by N on 24.04.14.
 */
public class Tests {

    public static void main(String[] args) {
        AutomobileSalon salon = new AutomobileSalon();
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        salon.PrintCar(salon.FindCarById(id));

        }
    }
