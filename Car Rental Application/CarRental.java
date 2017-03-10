import java.util.ArrayList;
/**
 * Write a description of class CarRental here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarRental
{
    private static ArrayList<smallCar> sCar; /// unrented smallCars
    private static ArrayList<largeCar> lCar; /// unrented largeCars
    private static ArrayList<DriversLicence> dLicence; /// people
    /**
     * Constructor for objects of class CarRental
     */
    public CarRental()throws Exception
    {
        sCar = new ArrayList<smallCar>(); 
        lCar = new ArrayList<largeCar>();
        dLicence = new ArrayList<DriversLicence>();
        for(int i = 0; i < 30; i++) 
        {
            sCar.add(new smallCar());
        }
        for(int x = 0; x < 20; x++)
        {
            lCar.add(new largeCar());
        }
        dLicence.add(new DriversLicence("Charlie", "Grey", "bob", true ));
        dLicence.add(new DriversLicence("Ste", "Powers", "sally", false ));
        dLicence.add(new DriversLicence("Nath", "Mallery", "blargh", true ));
        dLicence.add(new DriversLicence("Anya", "Durrant", "Gordon", true ));
      
    }

}
